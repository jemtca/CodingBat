
// given two strings, append them together (known as 'concatenation') and return the result
// however, if the concatenation creates a double-char, then omit one of the chars, so 'abc' and 'cat' yields 'abcat'
const conCat = (a, b) => {
    let str = '';

    if (a.length > 0 && b.length > 0 && a[a.length - 1] === b[0]) {
        str = a + b.substring(1);
    } else if (a.length > 0 && b.length === 0) {
        str = a;
    } else if (a.length === 0 && b.length > 0) {
        str = b;
    } else {
        str = a + b;
    }

    return str;
};

console.log(conCat('abc', 'cat'));
console.log(conCat('dog', 'cat'));
console.log(conCat('abc', ''));
