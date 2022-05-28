
// given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on
// count the number of times that the 2 strings are non-empty and start with the same char
// the strings may be any length, including 0
const matchUp = (a, b) => {
    let count = 0;

    for (let i = 0; i < a.length; i++) {
        if (a[i].length > 0 && b[i].length > 0) {
            if (a[i].charAt(0) === b[i].charAt(0)) {
                count++;
            }
        }
    }

    return count;
};

console.log(matchUp(['aa', 'bb', 'cc'], ['aaa', 'xx', 'bb']));
console.log(matchUp(['aa', 'bb', 'cc'], ['aaa', 'b', 'bb']));
console.log(matchUp(['aa', 'bb', 'cc'], ['', '', 'ccc']));
