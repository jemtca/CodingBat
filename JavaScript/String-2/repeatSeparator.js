
// given two strings, word and a separator sep
// return a big string made of count occurrences of the word, separated by the separator string
const repeatSeparator = (word, sep, count) => {
    let finalStr = '';

    for (let i = count; i > 0; i--) {
        if (i > 1) {
            finalStr = finalStr + word + sep;
        } else {
            finalStr = finalStr + word;
        }
    }

    return finalStr;
};

console.log(repeatSeparator('Word', 'X', 3));
console.log(repeatSeparator('This', 'And', 2));
console.log(repeatSeparator('This', 'And', 1));
