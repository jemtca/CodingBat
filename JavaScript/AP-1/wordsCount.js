
// given an array of strings, return the count of the number of strings with the given length
const wordsCount = (words, len) => {
    let result = 0;

    for (let i = 0; i < words.length; i++) {
        if (words[i].length === len) {
            result++;
        }
    }

    return result;
};

console.log(wordsCount(['a', 'bb', 'b', 'ccc'], 1));
console.log(wordsCount(['a', 'bb', 'b', 'ccc'], 3));
console.log(wordsCount(['a', 'bb', 'b', 'ccc'], 4));
