
// given two non-negative int values, return true if they have the same last digit, such as with 27 and 57
const lastDigit = (a, b) => {
    return a % 10 === b % 10 ? true : false;
};

console.log(lastDigit(7, 17));
console.log(lastDigit(6, 17));
console.log(lastDigit(3, 113));
