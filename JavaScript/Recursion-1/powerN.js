
// given base and n that are both 1 or more, compute recursively the value of base to the n power, so powerN(3, 2) is 9 (3 squared)
const powerN = (base, n) => {
    if (n === 0) {
        return 1;
    }

    return base * powerN(base, n - 1);
};

console.log(powerN(3, 1));
console.log(powerN(3, 2));
console.log(powerN(3, 3));
