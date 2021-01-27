
// given a string, return a 'rotated left 2' version where the first 2 chars are moved to the end
// the string length will be at least 2
const left2 = (str) => {
    return str.substring(2) + str.substring(0, 2);
};

console.log(left2('Hello'));
console.log(left2('java'));
console.log(left2('Hi'));
