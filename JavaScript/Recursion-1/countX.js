
// given a string, compute recursively the number of lowercase 'x' chars in the string
const countX = (str) => {
    if (!str) {
        return 0;
    }

    return str[0] === 'x' ? 1 + countX(str.substring(1)) : countX(str.substring(1));
};

console.log(countX('xxhixx'));
console.log(countX('xhixhix'));
console.log(countX('hi'));
