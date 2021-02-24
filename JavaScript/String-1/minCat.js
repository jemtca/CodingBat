
// given two strings, append them together (known as "concatenation") and return the result
// however, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string
// so 'Hello' and 'Hi' yield 'loHi'
const minCat = (a, b) => {
    let str = '';

    if (a.length > b.length) {
        str = a.substring(a.length - b.length) + b;
    } else if (a.length < b.length) {
        str = a + b.substring(b.length - a.length);
    } else {
        str = a + b;
    }

    return str;
};

console.log(minCat('Hello', 'Hi'));
console.log(minCat('Hello', 'java'));
console.log(minCat('java', 'Hello'));
