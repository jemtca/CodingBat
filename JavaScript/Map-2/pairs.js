
// given an array of non-empty strings, create and return a Map<String, String> as follows:
// for each string add its first character as a key with its last character as the value
const pairs = (strings) => {
    const myMap = new Map();

    for (let string of strings) {
        myMap.set(string[0], string[string.length - 1]);
    }

    return myMap;
};

console.log(pairs(['code', 'bug']));
console.log(pairs(['man', 'moon', 'main']));
console.log(pairs(['man', 'moon', 'good', 'night']));
