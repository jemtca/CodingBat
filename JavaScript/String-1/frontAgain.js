
// given a string, return true if the first 2 chars in the string also appear at the end of the string
// such as with 'edited'
const frontAgain = (str) => {
    let result = false;

    if (str.length > 1 && str.startsWith(str.substring(0, 2)) === str.endsWith(str.substring(0, 2))) {
        result = true;
    }

    return result;
};

console.log(frontAgain('edited'));
console.log(frontAgain('edit'));
console.log(frontAgain('ed'));
