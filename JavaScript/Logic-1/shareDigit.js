
// given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23
const shareDigit = (a, b) => {
    const a1 = a % 10;
    const a2 = (a / 10) % 10;
    const b1 = b % 10;
    const b2 = (b / 10) % 10;

    if (a1 === b1 || a1 === b2 || a2 === b1 || a2 === b2) {
        return true;
    }

    return false;
};

console.log(shareDigit(12, 23));
console.log(shareDigit(12, 43));
console.log(shareDigit(12, 44));
