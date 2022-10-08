
// given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a '*'
const pairStar = (str) => {
    if (!str) {
        return '';
    }

    return str[0] === str[1] ? str[0] + '*' + pairStar(str.substring(1)) : str[0] + pairStar(str.substring(1));
};

console.log(pairStar('hello'));
console.log(pairStar('xxyy'));
console.log(pairStar('aaaa'));
