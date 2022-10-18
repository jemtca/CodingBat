
// we'll say that a 'pair' in a string is two instances of a char separated by a char
// so 'AxA' the A's make a pair
// pair's can overlap, so 'AxAxA' contains 3 pairs -- 2 for A and 1 for x
// recursively compute the number of pairs in the given string
const countPairs = (str) => {
    if (!str) {
        return 0;
    }

    return str.length > 2 && str[0] === str[2] ? 1 + countPairs(str.substring(1)) : countPairs(str.substring(1));
};

console.log(countPairs('axa'));
console.log(countPairs('axax'));
console.log(countPairs('axbx'));
