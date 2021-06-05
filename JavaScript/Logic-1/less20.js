
// return true if the given non-negative number is 1 or 2 less than a multiple of 20
// so for example 38 and 39 return true, but 40 returns false
const less20 = (n) => {
    return (n + 2) % 20 === 0 || (n + 1) % 20 === 0 ? true : false;
};

console.log(less20(18));
console.log(less20(19));
console.log(less20(20));
