
// given a string of odd length, return the string length 3 from its middle, so 'Candy' yields 'and'
// the string length will be at least 3
const middleThree = (str) => {
    return str.substring((str.length / 2) - 1, (str.length / 2) + 2);
};

console.log(middleThree('Candy'));
console.log(middleThree('and'));
console.log(middleThree('solving'));
