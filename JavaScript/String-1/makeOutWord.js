
// given an 'out' string length 4, such as '<<>>', and a word, return a new string where the word is in the middle of the out string
// e.g. '<<word>>'. Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j
const makeOutWord = (out, word) => {
    return out.substring(0, 2) + word + out.substring(2);
};

console.log(makeOutWord('<<>>', 'Yay'));
console.log(makeOutWord('<<>>', 'WooHoo'));
console.log(makeOutWord('[[]]', 'word'));
