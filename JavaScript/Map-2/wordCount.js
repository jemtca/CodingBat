
// the classic word-count algorithm: given an array of strings
// return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array
const wordCount = (strings) => {
    const myMap = new Map();

    for (let i = 0; i < strings.length; i++) {
        if (!myMap.has(strings[i])) {
            myMap.set(strings[i], 1);
        } else {
            myMap.set(strings[i], myMap.get(strings[i]) + 1);
        }
    }

    return myMap;
};

console.log(wordCount(['a', 'b', 'a', 'c', 'b']));
console.log(wordCount(['c', 'b', 'a']));
console.log(wordCount(['c', 'c', 'c', 'c']));
