
// given a string and an int n, return a string made of the first and last n chars from the string
// the string length will be at least n
const nTwice = (str, n) => {
    return str.substring(0, n) + str.substring(str.length - n);
};

console.log(nTwice('Hello', 2));
console.log(nTwice('Chocolate', 3));
console.log(nTwice('Chocolate', 1));
