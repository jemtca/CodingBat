
// given a string, compute a new string by moving the first char to come after the next two chars, so 'abc' yields 'bca'
// repeat this process for each subsequent group of 3 chars, so 'abcdef' yields 'bcaefd'
// ignore any group of fewer than 3 chars at the end
const oneTwo = (str) => {
    let newStr = '';

    for (let i = 0; i < str.length - 2; i = i + 3) {
        newStr = newStr + str.substring(i + 1, i + 3) + str[i];
    }

    return newStr;
};

console.log(oneTwo('abc'));
console.log(oneTwo('tca'));
console.log(oneTwo('tcagdo'));
