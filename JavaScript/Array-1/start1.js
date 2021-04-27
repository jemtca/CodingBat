
// start with 2 int arrays, a and b, of any length
// return how many of the arrays have 1 as their first element
const start1 = (a, b) => {
    let count = 0;

    if (a.length > 0 && a[0] === 1) {
        count++;
    }

    if (b.length > 0 && b[0] === 1) {
        count++;
    }
     
    return count;
};

console.log(start1([1, 2, 3], [1, 3]));
console.log(start1([7, 2, 3], [1]));
console.log(start1([1, 2], []));
