
// given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string
const endX = (str) => {
    if (!str) {
        return '';
    }

    return str[0] === 'x' ? endX(str.substring(1)) + 'x' : str[0] + endX(str.substring(1));
};

console.log(endX('xxre'));
console.log(endX('xxhixx'));
console.log(endX('xhixhix'));
