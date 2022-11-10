
// given a string and a non-empty substring sub
// compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping
// n will be non-negative
const strCopies = (str, sub, n) => {
    if (n === 0) {
        return true;
    }

    if (str.length >= sub.length && str.substring(0, sub.length) === sub) {
        return strCopies(str.substring(1), sub, n - 1);
    }

    if (str.length >= sub.length && str.substring(0, sub.length) !== sub) {
        return strCopies(str.substring(1), sub, n);
    }

    return false;
};

console.log(strCopies('catcowcat', 'cat', 2));
console.log(strCopies('catcowcat', 'cow', 2));
console.log(strCopies('catcowcat', 'cow', 1));
