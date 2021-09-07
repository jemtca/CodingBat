
// given a non-empty string and an int n, return a new string where the char at index n has been removed
// the value of n will be a valid index of a char in the original string
const missingChar = (str, n) => {
    return str.substring(0, n) + str.substring(n + 1);
};

console.log(missingChar('kitten', 1));
console.log(missingChar('kitten', 0));
console.log(missingChar('kitten', 4));
