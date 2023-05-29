typealias SudokuBoard = Array<CharArray>

fun SudokuBoard.validateRow(): Boolean {
    for (r in this.indices) {
        var uniqValues = mutableSetOf<Char>()
        for (c in this[r]) {
            if (c != '.' && !uniqValues.add(c)) return false
        }
    }

    return true
}

fun SudokuBoard.validateColumn(): Boolean {
    for (r in this.indices) {
        var uniqValues = mutableSetOf<Char>()
        for (c in this[r].indices) {
            val el = this[c][r]
            if (el != '.' && !uniqValues.add(el)) return false
        }
    }

    return true
}

fun SudokuBoard.validateSubBoxes(): Boolean {
    fun validateSubBox(board: Array<CharArray>, r: Int, c: Int): Boolean {
        var uniqValues = mutableSetOf<Char>()

        for (i in r until r + 3) { //3,4,5
            for (j in c until c + 3) {//0,1,2
                val el = board[i][j]
                if (el != '.' && !uniqValues.add(el)) return false
            }
        }
        return true
    }

    for (r in this.indices step 3) {
        for (c in this[r].indices step 3) {
            if (!validateSubBox(this, r, c)) return false
        }
    }

    return true
}

fun SudokuBoard.isValid(): Boolean = this.validateRow() && this.validateColumn() && this.validateSubBoxes()

class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean = board.isValid()
}