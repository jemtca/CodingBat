
// given an array of strings, return a new List where all the strings of the given length are omitted
const wordsWithoutList = (words, len) => {
    let newList = [];

    for (let i = 0; i < words.length; i++) {
        if (words[i].length !== len) {
            newList.push(words[i]);
        }
    }

    return newList;
};

console.log(wordsWithoutList(['a', 'bb', 'b', 'ccc'], 1));
console.log(wordsWithoutList(['a', 'bb', 'b', 'ccc'], 3));
console.log(wordsWithoutList(['a', 'bb', 'b', 'ccc'], 4));
