
// given a string, return a new string made of 3 copies of the last 2 chars of the original string
// the string length will be at least 2
const extraEnd = (str) => {
    return str.substring(str.length - 2) + str.substring(str.length - 2) + str.substring(str.length - 2);
};

console.log(extraEnd('Hello'));
console.log(extraEnd('ab'));
console.log(extraEnd('Hi'));
