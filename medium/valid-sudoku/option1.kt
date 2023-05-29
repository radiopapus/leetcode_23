class Solution {
    fun validateRow(board: Array<CharArray>): Boolean {
        for (r in board.indices) {
            var uniqValues = mutableSetOf<Char>()
            for (c in board[r]) {
                if (c == '.') continue
                if (!uniqValues.add(c)) return false
            }
        }

        return true
    }

    fun validateColumn(board: Array<CharArray>): Boolean {
        for (r in board.indices) {
            var uniqValues = mutableSetOf<Char>()
            for (c in board[r].indices) {
                val el = board[c][r]
                if (el == '.') continue
                if (!uniqValues.add(el)) return false
            }
        }

        return true
    }

    fun _validateSubBox(board: Array<CharArray>, r: Int, c: Int): Boolean {
        var uniqValues = mutableSetOf<Char>()

        for (i in r until r + 3) { //3,4,5
            for (j in c until c + 3) {//0,1,2
                val el = board[i][j]
                if (el == '.') continue
                if (!uniqValues.add(el)) return false
            }
        }
        return true
    }

    // использовать validateColumn validateRow для Subbox
    fun validateSubBox(board: Array<CharArray>): Boolean {
        var isUnique = true
        for (r in board.indices step 3) { // 3
            for (c in board[r].indices step 3) { // 0
                isUnique = _validateSubBox(board, r, c)
                if (!isUnique) return false
            }
        }

        return isUnique
    }

    fun isValidSudoku(board: Array<CharArray>): Boolean = validateRow(board) && validateColumn(board) && validateSubBox(board)
}