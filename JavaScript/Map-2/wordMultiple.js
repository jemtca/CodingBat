
// Given an array of strings
// return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array
const wordMultiple = (strings) => {
    const myMap = new Map();

    for (let i = 0; i < strings.length; i++) {
        if (!myMap.has(strings[i])) {
            myMap.set(strings[i], false);
        } else {
            myMap.set(strings[i], true);
        }
    }

    return myMap;
};

console.log(wordMultiple(['a', 'b', 'a', 'c', 'b']));
console.log(wordMultiple(['c', 'b', 'a']));
console.log(wordMultiple(['c', 'c', 'c', 'c']));
