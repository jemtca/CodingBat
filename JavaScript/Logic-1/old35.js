
// return true if the given non-negative number is a multiple of 3 or 5, but not both
const old35 = (n) => {
    if (n % 3 === 0 && n % 5  === 0) {
        return false;
    }

    if (n % 3 === 0 || n % 5 === 0) {
        return true;
    }
    
    return false;
};

console.log(old35(3));
console.log(old35(10));
console.log(old35(15));
