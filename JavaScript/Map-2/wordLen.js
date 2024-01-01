
// given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length
const wordLen = (strings) => {
    const myMap = new Map();

    for (let i = 0; i < strings.length; i++) {
        if (!myMap.has(strings[i])) {
            myMap.set(strings[i], strings[i].length);
        }
    }

    return myMap;
};

console.log(wordLen(['a', 'bb', 'a', 'bb']));
console.log(wordLen(['this', 'and', 'that', 'and']));
console.log(wordLen(['code', 'code', 'code', 'bug']));
