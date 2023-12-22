
// given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0
// for example the string 'hello' makes the pair 'hello':0
// we'll do more complicated counting later, but for this problem the value is simply 0
const word0 = (strings) => {
    const myMap = new Map();

    for (let i = 0; i < strings.length; i++) {
        if (!myMap.has(strings[i])) {
            myMap.set(strings[i], 0);
        }
    }

    return myMap;
};

console.log(word0(['a', 'b', 'a', 'b']));
console.log(word0(['a', 'b', 'a', 'c', 'b']));
console.log(word0(['c', 'b', 'a']));
