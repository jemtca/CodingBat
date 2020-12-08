
// given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring
// so "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
const stringMatch = (a, b) => {

    let count = 0;
    const length = a.length > b.length ? b.length : a.length;

    for (let i = 0; i < length - 1; i++) {
        if (a.substring(i, i + 2) === b.substring(i, i + 2)) {
            count++;
        }
    }

    return count;

};

console.log(stringMatch('xxcaazz', 'xxbaaz'));
console.log(stringMatch('abc', 'abc'));
console.log(stringMatch('abc', 'axc'));
