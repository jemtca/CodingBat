
// given three ints, a b c, return true if one of b or c is 'close' (differing from a by at most 1)
// while the other is 'far', differing from both other values by 2 or more
const closerFar = (a, b, c) => {
    if (Math.abs(a - b) <= 1) {
        if (Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        }
    }

    if (Math.abs(a - c) <= 1) {
        if (Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        }
    }

    return false;
};

console.log(closerFar(1, 2, 10));
console.log(closerFar(1, 2, 3));
console.log(closerFar(4, 1, 3));
