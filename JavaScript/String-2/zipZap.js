
// look for patterns like 'zip' and 'zap' in the string -- length-3
// starting with 'z' and ending with 'p'
// return a string where for all such words, the middle letter is gone, so 'zipXzap' yields 'zpXzp'
const zipZap = (str) => {
    let newStr = '';

    for (let i = 0; i < str.length; i++) {
        if (str.length >= 3 && str[i] === 'z' && str[i + 2] === 'p') {
            newStr = newStr + str[i] + str[i + 2];
            i = i + 2;
        } else {
            newStr = newStr + str[i];
        }
    }

    return newStr;
};

console.log(zipZap('zipXzap'));
console.log(zipZap('zopzop'));
console.log(zipZap('zzzopzop'));
