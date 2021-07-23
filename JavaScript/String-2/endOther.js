
// given two strings, return true if either of the strings appears at the very end of the other string
// ignoring upper/lower case differences (in other words, the computation should not be 'case sensitive')
const endOther = (a, b) => {
    if (a.length > b.length) {
        if (b.toLowerCase() === a.substring(a.length - b.length).toLowerCase()) {
            return true;
        } else {
            return false;
        }
    } else if (b.length > a.length) {
        if (a.toLowerCase() === b.substring(b.length - a.length).toLowerCase()) {
            return true;
        } else {
            return false;
        }
    } else {
        if (a.toLowerCase() === b.substring(b.length - a.length).toLowerCase() || b.toLowerCase() === a.substring(a.length - b.length).toLowerCase()) {
            return true;
        } else {
            return false;
        }
    }
};

console.log(endOther('Hiabc', 'abc'));
console.log(endOther('AbC', 'HiaBc'));
console.log(endOther('abc', 'abXabc'));
