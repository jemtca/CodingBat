
// given two int values, return whichever value is larger
// however if the two values have the same remainder when divided by 5, then the return the smaller value
// however, in all cases, if the two values are the same, return 0
const maxMod5 = (a, b) => {
    if (a === b) {
        return 0;
    }

    if (a % 5 === b % 5) {
        return Math.min(a, b);
    }

    return Math.max(a, b);
};

console.log(maxMod5(2, 3));
console.log(maxMod5(6, 2));
console.log(maxMod5(3, 2));
