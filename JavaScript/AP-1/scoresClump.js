
// given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2
// such as with {3, 4, 5} or {3, 5, 5}
const scoresClump = (scores) => {
    for (let i = 0; i < scores.length - 2; i++) {
        if (Math.abs(scores[i] - scores[i + 1]) <= 2 && Math.abs(scores[i + 1] - scores[i + 2]) <= 2 && Math.abs(scores[i] - scores[i + 2]) <= 2) {
            return true;
        }
    }

    return false;
};

console.log(scoresClump([3, 4, 5]));
console.log(scoresClump([3, 4, 6]));
console.log(scoresClump([1, 3, 5, 5]));
