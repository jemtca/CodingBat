
// given a string, compute recursively the number of times lowercase 'hi' appears in the string
const countHi = (str) => {
    if (!str) {
        return 0;
    }

    return str.substring(0, 2) === 'hi' ? 1 + countHi(str.substring(2)) : countHi(str.substring(1));
};

console.log(countHi('xxhixx'));
console.log(countHi('xhixhix'));
console.log(countHi('hi'));
