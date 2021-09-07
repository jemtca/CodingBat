
// given a string and a non-negative int n, return a larger string that is n copies of the original string
const stringTimes = (str, n) => {
    let newStr = '';

    for (let i = 0; i < n; i++) {
        newStr = newStr + str;
    }

    return newStr;
};

console.log(stringTimes('Hi', 2));
console.log(stringTimes('Hi', 3));
console.log(stringTimes('Hi', 1));
