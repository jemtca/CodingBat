
// given three ints, a b c, one of them is small, one is medium and one is large
// return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large
const evenlySpaced = (a, b, c) => {
    return a + b === 2 * c || a + c === 2 * b || b + c === 2 * a;
};

console.log(evenlySpaced(2, 4, 6));
console.log(evenlySpaced(4, 6, 2));
console.log(evenlySpaced(4, 6, 3));
