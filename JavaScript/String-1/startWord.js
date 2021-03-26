
// given a string and a second 'word' string, we'll say that the word matches the string if it appears at the front of the string,
// except its first char does not need to match exactly
// on a match, return the front of the string, or otherwise return the empty string
// so, so with the string 'hippo' the word 'hi' returns 'hi' and 'xip' returns 'hip'
// the word will be at least length 1.
const startWord = (str, word) => {

};

console.log(startWord('hippo', 'hi'));
console.log(startWord('hippo', 'xip'));
console.log(startWord('hippo', 'i'));
