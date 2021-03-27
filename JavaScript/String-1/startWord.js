
// given a string and a second 'word' string, we'll say that the word matches the string if it appears at the front of the string,
// except its first char does not need to match exactly
// on a match, return the front of the string, or otherwise return the empty string
// so, so with the string 'hippo' the word 'hi' returns 'hi' and 'xip' returns 'hip'
// the word will be at least length 1.
const startWord = (str, word) => {
    let newWord = word.substring(1);

    if (str.length === 1 && word.length === 1) {
        return str;
    }
    else if (str.length > 1 && str.substring(1).startsWith(newWord)) {
        return str.substring(0, word.length);
    } else {
        return '';
    }    
};

console.log(startWord('hippo', 'hi'));
console.log(startWord('hippo', 'xip'));
console.log(startWord('hippo', 'i'));
