
// given 3 int values, a b c, return their sum.
// however, if one of the values is 13 then it does not count towards the sum and values to its right do not count
// so for example, if b is 13, then both b and c do not count
const luckySum = (a, b, c) => {
    if (a === 13) {
        return 0;
    }

    if (b === 13) {
        return a;
    }

    if (c === 13) {
        return a + b;
    }

    return a + b + c;
};

console.log(luckySum(1, 2, 3));
console.log(luckySum(1, 2, 13));
console.log(luckySum(1, 13, 3));
