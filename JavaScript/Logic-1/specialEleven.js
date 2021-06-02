
// we'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11
// return true if the given non-negative number is special
const special11 = (n) => {
    return n % 11 === 0 || n % 11 === 1 ? true : false;
};

console.log(special11(22));
console.log(special11(23));
console.log(special11(24));
