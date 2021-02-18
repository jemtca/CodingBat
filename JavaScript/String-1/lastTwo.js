
// given a string of any length, return a new string where the last 2 chars, if present, are swapped
// so 'coding' yields 'codign'
const lastTwo = (str) => {
    let newStr = '';

    if (str.length < 2) {
        newStr = str;
    } else {
        newStr = str.substring(0, str.length - 2) + str[str.length - 1] + str[str.length - 2];
    }

    return newStr;
};

console.log(lastTwo('coding'));
console.log(lastTwo('cat'));
console.log(lastTwo('ab'));
