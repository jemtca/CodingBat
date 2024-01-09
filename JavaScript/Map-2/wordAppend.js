
// loop over the given array of strings to build a result string like this:
// when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result
// return the empty string if no string appears a 2nd time
const wordAppend = (strings) => {
    const myMap = new Map();
    let str = '';

    for (let i = 0; i < strings.length; i++) {
        if (!myMap.has(strings[i])) {
            myMap.set(strings[i], 1);
        } else {
            myMap.set(strings[i], myMap.get(strings[i]) + 1);
        }
        
        if (myMap.get(strings[i]) % 2 === 0) {
            str = str + strings[i];
        }
    }

    return str;
};

console.log(wordAppend(['a', 'b', 'a']));
console.log(wordAppend(['a', 'b', 'a', 'c', 'a', 'd', 'a']));
console.log(wordAppend(['a', '', 'a']));
