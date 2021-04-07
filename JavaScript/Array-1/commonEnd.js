
// given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element
// both arrays will be length 1 or more
const commondEnd = (a, b) => {
    return a[0] === b[0] || a[a.length - 1] === b[b.length - 1] ? true : false;
};

console.log(commondEnd([1, 2, 3], [7, 3]));
console.log(commondEnd([1, 2, 3], [7, 3, 2]));
console.log(commondEnd([1, 2, 3], [1, 3]));
