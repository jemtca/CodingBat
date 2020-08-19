
// given 2 ints, a and b, return true if one of them is 10 or if their sum is 10
const makes10 = (a, b) => {

    return (a === 10 || b === 10) || a + b === 10 ? true : false;

}

console.log(makes10(9, 10));
console.log(makes10(9, 9));
console.log(makes10(1, 9));
