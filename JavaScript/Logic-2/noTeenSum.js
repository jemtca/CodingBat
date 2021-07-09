
// given 3 int values, a b c, return their sum
// however, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens
// write a separate helper public int fixTeen(int n) that takes in an int value and returns that value fixed for the teen rule
const fixTeen = (n) => {
    if (n >= 13 && n <= 19) {
        if (n !== 15 && n !== 16) {
            n = 0;
        }
    }

    return n;
};

const noTeenSum = (a, b, c) => {
    return fixTeen(a) + fixTeen(b) + fixTeen(c);
};

console.log(noTeenSum(1, 2, 3));
console.log(noTeenSum(2, 13, 1));
console.log(noTeenSum(2, 1, 14));
