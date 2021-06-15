
// given an int n, return the string form of the number followed by '!'
// so the int 6 yields '6!'
// except if the number is divisible by 3 use 'Fizz' instead of the number
// and if the number is divisible by 5 use 'Buzz'
// and if divisible by both 3 and 5, use 'FizzBuzz'
const fizzString2 = (n) => {
    if (n % 3 === 0 && n % 5 === 0) {
        return 'FizzBuzz!';
    }

    if (n % 3 === 0) {
        return 'Fizz!';
    }

    if (n % 5 === 0) {
        return 'Buzz!';
    }

    return n + '!';
};

console.log(fizzString2(1));
console.log(fizzString2(2));
console.log(fizzString2(3));
