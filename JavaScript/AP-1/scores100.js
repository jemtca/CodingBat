
// given an array of scores, return true if there are scores of 100 next to each other in the array
// the array length will be at least 2
const scores100 = (scores) => {
    for (let i = 0; i < scores.length - 1; i++) {
        if (scores[i] === 100 && scores[i + 1] === 100) {
            return true;
        }
    }

    return false;
};

console.log(scores100([1, 100, 100]));
console.log(scores100([1, 100, 99, 100]));
console.log(scores100([100, 1, 100, 100]));
