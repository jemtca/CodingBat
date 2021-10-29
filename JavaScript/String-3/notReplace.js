
// given a string, return a string where every appearance of the lowercase word 'is' has been replaced with 'is not'
// the word 'is' should not be immediately preceeded or followed by a letter -- so for example the 'is' in 'this' does not count
const notReplace = (str) => {
    let newStr = '';

    for (let i = 0; i < str.length; i++) {
        if ((i - 1 >= 0 && isNaN(str[i - 1])) || (i + 2 < str.length && isNaN(str[i + 2]))) {
            newStr = newStr + str[i];
        } else if (i + 1 < str.length && str.substring(i, i + 2) === 'is') {
            newStr = newStr + 'is not';
            i++;
        } else {
            newStr = newStr + str[i];
        }
    }

    return newStr;
};

console.log(notReplace('is test'));
console.log(notReplace('is-is'));
console.log(notReplace('This is right'));
