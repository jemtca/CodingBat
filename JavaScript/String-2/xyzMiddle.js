
// given a string, does 'xyz' appear in the middle of the string?
// to define middle, we'll say that the number of chars to the left and right of the 'xyz' must differ by at most one
// this problem is harder than it looks
const xyxMiddle = (str) => {
    for (let i = 0; i < str.length - 2; i++) {
        if (str[i] === 'x' && str[i + 1] === 'y' && str[i + 2] === 'z') {
            if (Math.abs(str.substring(0, i).length - str.substring(i + 3).length) <= 1) {
                return true;
            }
        }
    }

    return false;
};

console.log(xyxMiddle('AAxyzBB'));
console.log(xyxMiddle('AxyzBB'));
console.log(xyxMiddle('AxyzBBB'));
