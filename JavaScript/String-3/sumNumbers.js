
// given a string, return the sum of the numbers appearing in the string, ignoring all other characters
// a number is a series of 1 or more digit chars in a row
const sumNumbers = (str) => {
    let sum = 0;
    let temp = '';

    for (let i = 0; i < str.length; i++) {
        if (!isNaN(str[i]) && str[i] !== ' ') {
            temp = temp + str[i];
        } else {
            sum = sum + Number(temp);
            temp = '';
        }

        if (i === str.length - 1 && temp.length > 0) {
            sum = sum + Number(temp);
        }
    }

    return sum;
};

console.log(sumNumbers('abc123xyz'));
console.log(sumNumbers('aa11b33'));
console.log(sumNumbers('7 11'));
