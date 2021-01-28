
// given a string, return a 'rotated right 2' version where the last 2 chars are moved to the start
// the string length will be at least 2
const right2 = (str) => {
    return str.substring(str.length - 2) + str.substring(0, str.length - 2); 
};

console.log(right2('Hello'));
console.log(right2('java'));
console.log(right2('Hi'));
