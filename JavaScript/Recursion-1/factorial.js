
// given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1
// compute the result recursively
const factorial = (n) => {
    if (n === 1) {
        return 1;
    }

    return n * factorial(n - 1);
};

console.log(factorial(1));
console.log(factorial(2));
console.log(factorial(3));
