
// given a string, return a version without the first and last char
// so 'Hello' yields 'ell'
// the string length will be at least 2
const withoutEnd = (str) => {
    return str.substring(1, str.length - 1);
};

console.log(withoutEnd('Hello'));
console.log(withoutEnd('java'));
console.log(withoutEnd('coding'));
