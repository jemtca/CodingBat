
// given a string, compute recursively a new string where all the adjacent chars are now separated by a '*'
const allStar = (str) => {
    if (!str) {
        return '';
    }

    return str.length > 1 ? str[0] + '*' + allStar(str.substring(1)) : str[0] + allStar(str.substring(1));
};

console.log(allStar('hello'));
console.log(allStar('abc'));
console.log(allStar('ab'));
