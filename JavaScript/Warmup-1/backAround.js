
// given a string, take the last char and return a new string with the last char added at the front and back, so 'cat' yields 'tcatt'
// he original string will be length 1 or more
const backAround = (str) => {
    return str[str.length - 1] + str + str[str.length - 1];
};

console.log(backAround('cat'));
console.log(backAround('Hello'));
console.log(backAround('a'));
