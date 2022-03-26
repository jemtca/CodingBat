
// given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping)
const seriesUp = (n) => {
    let array = [];

    for (let i = 0; i < n; i++) {
        for (let j = 0; j <= i; j++) {
            array.push(j + 1);
        }
    }

    return array;
};

console.log(seriesUp(3));
console.log(seriesUp(4));
console.log(seriesUp(2));
