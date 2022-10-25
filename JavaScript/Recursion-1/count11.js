
// given a string, compute recursively the number of '11' substrings in the string
// the '11' substrings should not overlap
const count11 = (str) => {
    if (!str) {
        return 0;
    }

    return str.length > 1 && str.substring(0, 2) === '11' ? 1 + count11(str.substring(2)) : count11(str.substring(1));
};

console.log(count11('11abc11'));
console.log(count11('abc11x11x11'));
console.log(count11('111'));
