
// given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so 'kitten' yields 'kikittenki'
// if the string length is less than 2, use whatever chars are there
const front22 = (str) => {
    if (str.length < 2) {
        return str + str + str;
    } else {
        return str.substring(0, 2) + str + str.substring(0, 2);
    }
};

console.log(front22('kitten'));
console.log(front22('Ha'));
console.log(front22('abc'));
