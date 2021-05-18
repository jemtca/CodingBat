
// given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b
// the arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays
const make2 = (a, b) => {
    let newArray = [];

    if (a.length === 0) {
        newArray.push(b[0]);
        newArray.push(b[1]);
    } else if (a.length === 1) {
        newArray.push(a[0]);
        newArray.push(b[0]);
    } else {
        newArray = newArray.concat(a);
    }

    return newArray;
};

console.log(make2([4, 5], [1, 2, 3]));
console.log(make2([4], [1, 2, 3]));
console.log(make2([], [1, 2]));
