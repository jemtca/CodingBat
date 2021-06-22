
// given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7
// however, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5
const inOrderEqual = (a, b, c, equalOk) => {
    return (!equalOk && b > a && c > b) || (equalOk && b >= a && c >= b) ? true : false;
};

console.log(inOrderEqual(2, 5, 11, false));
console.log(inOrderEqual(7, 5, 6, false));
console.log(inOrderEqual(5, 5, 7, true));
