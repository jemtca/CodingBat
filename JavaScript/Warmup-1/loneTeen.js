
// we'll say that a number is "teen" if it is in the range 13..19 inclusive
// given 2 int values, return true if one or the other is teen, but not both
const loneTeent = (a, b) => {

    const aTeen = (a >= 13 && a <= 19);
    const bTeen = (b >= 13 && b <= 19);
    
    return (aTeen && !bTeen) || (!aTeen && bTeen) ? true : false;

}

console.log(loneTeent(13, 99));
console.log(loneTeent(21, 19));
console.log(loneTeent(13, 13));
