
// count the number of "xx" in the given string
// we'll say that overlapping is allowed, so "xxx" contains 2 "xx"
const countXX = (str) => {

    let count = 0;

    for (let i = 0; i < str.length - 1; i++) {
        if (str[i].toLowerCase() === 'x' && str[i+1].toLowerCase() === 'x') {
            count++;
        }
    }

    return count;

};

console.log(countXX('abcxx'));
console.log(countXX('xxx'));
console.log(countXX('xxxx'));
