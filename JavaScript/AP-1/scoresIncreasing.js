
// given an array of scores, return true if each score is equal or greater than the one before
// the array will be length 2 or more
const scoresIncreasing = (scores) => {
    for (let i = 1; i < scores.length; i++) {
        if (scores[i] < scores[i - 1]) {
            return false;
        }
    }

    return true;
};

console.log(scoresIncreasing([1, 3, 4]));
console.log(scoresIncreasing([1, 3, 2]));
console.log(scoresIncreasing([1, 1, 4]));
