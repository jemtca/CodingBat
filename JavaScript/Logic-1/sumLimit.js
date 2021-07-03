
// given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a
// if the sum has more digits than a, just return a without b
const sumLimit = (a, b) => {
    const lengthA = a.toString().length;
    const lengthAB = (a + b).toString().length;

    return lengthAB === lengthA ? a + b : a;
};

console.log(sumLimit(2, 3));
console.log(sumLimit(8, 3));
console.log(sumLimit(8, 1));
