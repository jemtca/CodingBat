
// given 2 int values greater than 0
// return whichever value is nearest to 21 without going over
// return 0 if they both go over
const blackjack = (a, b) => {
    if (a > 21 && b > 21) {
        return 0;
    }

    if (a > 21) {
        return b;
    }

    if (b > 21) {
        return a;
    }

    return Math.max(a, b);
};

console.log(blackjack(19, 21));
console.log(blackjack(21, 19));
console.log(blackjack(19, 22));
