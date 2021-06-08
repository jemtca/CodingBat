
// given a non-negative number 'num'
// return true if num is within 2 of a multiple of 10
const near10 = (num) => {
    return (num - 2) % 10 === 0 || (num - 1) % 10 === 0 || (num % 10) === 0 || (num + 2) % 10 === 0 || (num + 1) % 10 === 0 ? true : false;
};

console.log(near10(12));
console.log(near10(17));
console.log(near10(19));
