
// you have a blue lottery ticket, with ints a, b, and c on it
// this makes three pairs, which we'll call ab, bc, and ac
// consider the sum of the numbers in each pair
// if any pair sums to exactly 10, the result is 10
// otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5
// otherwise the result is 0
const blueTicket = (a, b, c) => {
    const pairAB = a + b;
    const pairAC = a + c;
    const pairBC = b + c;

    if (pairAB === 10 || pairAC === 10 || pairBC === 10) {
        return 10;
    }

    if (pairAB === pairAC + 10 || pairAB === pairBC + 10) {
        return 5;
    }

    return 0;
};

console.log(blueTicket(9, 1, 0));
console.log(blueTicket(9, 2, 0));
console.log(blueTicket(6, 1, 4));
