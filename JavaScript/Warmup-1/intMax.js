
// given three int values, a b c, return the largest
const intMax = (a, b, c) => {
    if (a >= b && a >= c) {
        return a;
    } else if (b >= a && b >= c) {
        return b;
    } else {
        return c;
    }
};

console.log(intMax(1, 2, 3));
console.log(intMax(1, 3, 2));
console.log(intMax(3, 2, 1));
