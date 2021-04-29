
// start with 2 int arrays, a and b, each length 2
// consider the sum of the values in each array
// return the array which has the largest sum
// in event of a tie, return a
const biggerTwo = (a, b) => {
    if (a[0] + a[1] < b[0] + b[1]) {
        return b;
    } else {
        return a;
    }
};

console.log(biggerTwo([1, 2], [3, 4]));
console.log(biggerTwo([3, 4], [1, 2]));
console.log(biggerTwo([1, 1], [1, 2]));
