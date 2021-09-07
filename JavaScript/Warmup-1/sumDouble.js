
// given two int values, return their sum. Unless the two values are the same, then return double their sum
const sumDouble = (a, b) => {
    return a === b ? (a + b) * 2 : a + b;
};

console.log(sumDouble(1, 2));
console.log(sumDouble(3, 2));
console.log(sumDouble(2, 2));
