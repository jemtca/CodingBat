
// given 3 int values, a b c, return their sum
// however, if one of the values is the same as another of the values, it does not count towards the sum
const loneSum = (a, b, c) => {
    if (a === b && b === c) {
        return 0;
    } else if (a === b) {
        return c;
    } else if (a === c) {
        return b;
    } else if (b === c) {
        return a;
    } else {
        return a + b + c;
    }
};

console.log(loneSum(1, 2, 3));
console.log(loneSum(3, 2, 3));
console.log(loneSum(3, 3, 3));
