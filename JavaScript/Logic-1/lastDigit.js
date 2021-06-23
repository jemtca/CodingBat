
// given three ints, a b c, return true if two or more of them have the same rightmost digit
// the ints are non-negative
const lastDigit = (a, b, c) => {
    return a % 10 === b % 10 || a % 10 === c % 10 || b % 10 === c % 10 ? true : false;
};

console.log(lastDigit(23, 19, 13));
console.log(lastDigit(23, 19, 12));
console.log(lastDigit(23, 19, 3));
