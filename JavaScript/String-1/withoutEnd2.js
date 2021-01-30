
// given a string, return a version without both the first and last char of the string
// the string may be any length, including 0.
const withoutEnd2 = (str) => {
    return str.length > 2 ? str.substring(1, str.length - 1) : '';
};

console.log(withoutEnd2('Hello'));
console.log(withoutEnd2('abc'));
console.log(withoutEnd2('ab'));
