
// we have an array of heights, representing the altitude along a walking trail
// given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index
// we'll say that step is big if it is 5 or more up or down
// the start end end index will both be valid indexes into the array with start <= end
const bigHeights = (heights, start, end) => {
    let total = 0;

    for (let i = start; i < end; i++) {
        if (Math.abs(heights[i] - heights[i + 1]) > 4) {
            total++;
        }
    }

    return total;
};

console.log(bigHeights([5, 3, 6, 7, 2], 2, 4));
console.log(bigHeights([5, 3, 6, 7, 2], 0, 1));
console.log(bigHeights([5, 3, 6, 7, 2], 0, 4));
