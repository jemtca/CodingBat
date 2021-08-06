
// given a string, consider the prefix string made of the first N chars of the string
// does that prefix string appear somewhere else in the string?
// assume that the string is not empty and that N is in the range 1..str.length()
const prefixAgain = (str, n) => {
    const prefix = str.substring(0, n);
    const tail = str.substring(n);

    if (tail.includes(prefix)) {
        return true;
    }
    
    return false;
};

console.log(prefixAgain('abXYabc', 1));
console.log(prefixAgain('abXYabc', 2));
console.log(prefixAgain('abXYabc', 3));
