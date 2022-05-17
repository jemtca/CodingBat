
// given an array of strings, return a new array containing the first n strings
// n will be in the range 1..length
const wordsFront = (words, n) => {
    let newArray = [];

    for (let i = 0; i < n; i++) {
        newArray.push(words[i]);
    }

    return newArray;
};

console.log(wordsFront(['a', 'b', 'c', 'd'], 1));
console.log(wordsFront(['a', 'b', 'c', 'd'], 2));
console.log(wordsFront(['a', 'b', 'c', 'd'], 3));
