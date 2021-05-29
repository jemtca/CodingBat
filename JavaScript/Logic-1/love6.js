
// the number 6 is a truly great number
// given two int values, a and b, return true if either one is 6
// or if their sum or difference is 6
const love6 = (a, b) => {
    return (a === 6 || b === 6) || (a + b === 6 || a - b === 6 || b - a === 6) ? true : false;
};

console.log(love6(6, 4));
console.log(love6(4, 5));
console.log(love6(1, 5));
