
// given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2
// note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12)
const count7 = (n) => {
    if (n === 0) {
        return 0;
    }

    return n % 10 === 7 ? 1 + count7(Math.floor(n / 10)) : count7(Math.floor(n / 10));
};

console.log(count7(717));
console.log(count7(7));
console.log(count7(123));
