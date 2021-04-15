
// given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements
const middleWay = (a, b) => {
    const newArray = [];

    newArray.push(a[1]);
    newArray.push(b[1]);

    return newArray;
};

console.log(middleWay([1, 2, 3], [4, 5, 6]));
console.log(middleWay([7, 7, 7], [3, 8, 0]));
console.log(middleWay([5, 2, 9], [1, 4, 5]));
