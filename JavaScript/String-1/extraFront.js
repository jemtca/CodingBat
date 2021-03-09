
// given a string, return a new string made of 3 copies of the first 2 chars of the original string
// the string may be any length
// if there are fewer than 2 chars, use whatever is there
const extraFront = (str) => {
    let newStr = '';

    if (str.length < 2) {
        newStr = str.substring(0, str.length) + str.substring(0, str.length) + str.substring(0, str.length);
    } else {
        newStr = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }

    return newStr;
};

console.log(extraFront('Hello'));
console.log(extraFront('ab'));
console.log(extraFront('H'));
