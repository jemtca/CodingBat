
// return true if the given non-negative number is 1 or 2 more than a multiple of 20
const more20 = (n) => {
    return (n - 1) % 20 === 0 || (n - 2) % 20 === 0 ? true : false;
};

console.log(more20(20));
console.log(more20(21));
console.log(more20(22));
