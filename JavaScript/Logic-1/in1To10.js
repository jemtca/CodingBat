
// given a number n, return true if n is in the range 1..10, inclusive
// unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10
const in1To10 = (n, outsideMode) => {
    if ((outsideMode && (n <= 1 || n >= 10)) || (!outsideMode && n >= 1 && n <= 10)) {
        return true;
    }

    return false;
};

console.log(in1To10(5, false));
console.log(in1To10(11, false));
console.log(in1To10(11, true));
