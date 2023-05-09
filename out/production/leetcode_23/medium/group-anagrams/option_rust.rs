use std::collections::HashMap;
use std::iter::FromIterator;

impl Solution {
    pub fn group_anagrams(strs: Vec<String>) -> Vec<Vec<String>> {
        let mut map: HashMap<String, Vec<String>> = HashMap::new();

        for s in strs {
            let mut chars: Vec<char> = s.chars().collect();
            chars.sort_by(|a, b| b.cmp(a));
            let key = String::from_iter(chars);
            if let Some(el) = map.get_mut(&key) {
                el.push(s)
            } else {
                map.insert(key, vec![s]);
            }
        }

        map.into_values().collect()
    }
}