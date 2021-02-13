
// given a string, return a string length 2 made of its first 2 chars
// if the string length is less than 2, use '@' for the missing chars
const atFirst = (str) => {
    let newStr = '';

    if (str.length === 0) {
        newStr = '@@';
    } else if (str.length === 1) {
        newStr = str[0] + '@';
    } else {
        newStr = str.substring(0, 2);
    }

    return newStr;
};

console.log(atFirst('hello'));
console.log(atFirst('hi'));
console.log(atFirst('h'));
