
// given a string of even length, return a string made of the middle two chars, so the string 'string' yields 'ri'
// the string length will be at least 2
const middleTwo = (str) => {
    return str[(str.length / 2) - 1] + str[str.length / 2];
};

console.log(middleTwo('string'));
console.log(middleTwo('code'));
console.log(middleTwo('Practice'));
