
// given 2 strings, return their concatenation, except omit the first char of each
// the strings will be at least length 1
const nonStart = (a, b) => {
    return a.substring(1) + b.substring(1);
};

console.log(nonStart('Hello', 'There'));
console.log(nonStart('java', 'code'));
console.log(nonStart('shotl', 'java'));
