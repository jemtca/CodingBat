
// given three ints, a b c, return true if it is possible to add two of the ints to get the third
const twoAsOne = (a, b, c) => {
    return a + b === c || a + c === b || b + c === a ? true : false;
};

console.log(twoAsOne(1, 2, 3));
console.log(twoAsOne(3, 1, 2));
console.log(twoAsOne(3, 2, 2));
