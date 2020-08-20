
// given 2 int values, return true if one is negative and one is positive
// except if the parameter "negative" is true, then return true only if both are negative
const posNeg = (a, b, negative) => {

    if (negative) {
        return (a < 0 && b < 0) ? true : false ;
    } else {
        return ((a > 0 && b < 0) || (a < 0 && b > 0)) ? true : false;
    }

}

console.log(posNeg(1, -1, false));
console.log(posNeg(-1, 1, false));
console.log(posNeg(-4, -5, true));
