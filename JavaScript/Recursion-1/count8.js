
// given a non-negative int n, compute recursively the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4
// note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12)
const count8 = (n) => {
    if (n === 0) {
        return 0;
    }

    if (n % 100 === 88) {
        return 2 + count8(Math.floor(n / 10));
    } else if (n % 10 === 8) {
        return 1 + count8(Math.floor(n / 10));
    } else {
        return count8(Math.floor(n / 10));
    }
};

console.log(count8(8));
console.log(count8(818));
console.log(count8(8818));
