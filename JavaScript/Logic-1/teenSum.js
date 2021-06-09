
// given 2 ints, a and b, return their sum
// however, 'teen' values in the range 13..19 inclusive, are extra lucky
// so if either value is a teen, just return 19
const teenSum = (a, b) => {
    if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
        return 19;
    }

    return a + b;
};

console.log(teenSum(3, 4));
console.log(teenSum(10, 13));
console.log(teenSum(13, 2));
