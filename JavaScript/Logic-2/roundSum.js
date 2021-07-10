
// for this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20
// alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10
// given 3 ints, a b c, return the sum of their rounded values
const round10 = (n) => {
    if (n % 10 >= 5) {
        return n + (10 - (n % 10));
    }

    if (n % 10 <  5) {
        return n - (n % 10);
    }

    return n;
};

const roundSum = (a, b, c) => {
    return round10(a) + round10(b) + round10(c);
};

console.log(roundSum(16, 17, 18));
console.log(roundSum(12, 13, 14));
console.log(roundSum(6, 4, 4));
