
// given a string, compute recursively a new string where all the 'x' chars have been removed
const noX = (str) => {
    if (!str) {
        return '';
    }

    return str[0] !== 'x' ? str[0] + noX(str.substring(1)) : noX(str.substring(1));
};

console.log(noX('xaxb'));
console.log(noX('abc'));
console.log(noX('xx'));
