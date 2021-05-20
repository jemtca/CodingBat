
// given 2 int arrays, a and b, of any length, return a new array with the first element of each array
// if either array is length 0, ignore that array
const front11 = (a, b) => {
    const newArray = [];

    if (a.length === 0 && b.length === 0) {
        return newArray;
    } else if (a.length === 0) {
        newArray.push(b[0]);
    } else if (b.length === 0) {
        newArray.push(a[0]);
    } else {
        newArray.push(a[0]);
        newArray.push(b[0]);
    }

        return newArray;
};

console.log(front11([1, 2, 3], [7, 9, 8]));
console.log(front11([1], [2]));
console.log(front11([1, 7], []));
