
// we have an array of heights, representing the altitude along a walking trail
// given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index
// for example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6
// the start end end index will both be valid indexes into the array with start <= end
const sumHeights = (heights, start, end) => {
    let sum = 0;

    for (let i = start; i < end; i++) {
        sum = sum + Math.abs(heights[i] - heights[i + 1]);
    }

    return sum;
};

console.log(sumHeights([5, 3, 6, 7, 2], 2, 4));
console.log(sumHeights([5, 3, 6, 7, 2], 0, 1));
console.log(sumHeights([5, 3, 6, 7, 2], 0, 4));
