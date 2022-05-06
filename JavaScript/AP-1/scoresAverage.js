
// given an array of scores, compute the int average of the first half and the second half, and return whichever is larger
// we'll say that the second half begins at index length/2
// the array length will be at least 2
const scoresAverage = (scores) => {
    let avg1 = 0;
    let avg2 = 0;

    for (let i = 0; i < scores.length / 2; i++) {
        avg1 = avg1 + scores[i];
    }

    avg1 = avg1 / (scores.length / 2);

    for (let i = scores.length / 2; i < scores.length; i++) {
        avg2 = avg2 + scores[i];
    }

    avg2 = avg2 / (scores.length / 2);

    return Math.max(avg1, avg2);
};

console.log(scoresAverage([2, 2, 4, 4]));
console.log(scoresAverage([4, 4, 4, 2, 2, 2]));
console.log(scoresAverage([3, 4, 5, 1, 2, 3]));
