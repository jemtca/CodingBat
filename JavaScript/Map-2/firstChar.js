
// given an array of non-empty strings
// return a Map<String, String> with a key for every different first character seen
// with the value of all the strings starting with that character appended together in the order they appear in the array
const firstChar = (strings) => {
    const myMap = new Map();

    for (let i = 0; i < strings.length; i++) {
        if (!myMap.has(strings[i][0])) {
            myMap.set(strings[i][0], strings[i]);
        } else {
            const prevStr = myMap.get(strings[i][0]);

            myMap.set(strings[i][0], prevStr + strings[i]);
        }
    }

    return myMap;
};

console.log(firstChar(['salt', 'tea', 'soda', 'toast']));
console.log(firstChar(['aa', 'bb', 'cc', 'aAA', 'cCC', 'd']));
console.log(firstChar([]));
