
// given three ints, a b c, return true if b is greater than a, and c is greater than b
// however, with the exception that if "bOk" is true, b does not need to be greater than a
const inOrder = (a, b, c, bOk) => {
    return (!bOk && b > a && c > b) || (bOk && c > b) ? true : false;
};

console.log(inOrder(1, 2, 4, false));
console.log(inOrder(1, 2, 1, false));
console.log(inOrder(1, 1, 2, true));
