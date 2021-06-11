
// given a string str, if the string starts with 'f' return 'Fizz'
// if the string ends with 'b' return 'Buzz'
// if both the 'f' and 'b' conditions are true, return 'FizzBuzz'
// in all other cases, return the string unchanged
const fizzString = (str) => {
    if (str.startsWith('f') && str.endsWith('b')) {
        return 'FizzBuzz';
    }

    if (str.startsWith('f')) {
        return 'Fizz';
    }

    if (str.endsWith('b')) {
        return 'Buzz';
    }

    return str;
};

console.log(fizzString('fig'));
console.log(fizzString('dib'));
console.log(fizzString('fib'));
