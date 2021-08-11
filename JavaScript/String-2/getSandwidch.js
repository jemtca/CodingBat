
// a sandwich is two pieces of bread with something in between
// return the string that is between the first and last appearance of 'bread' in the given string
// or return the empty string '' if there are not two pieces of bread
const getSandwich = (str) => {
    let count = 0;
    let startIndex = 0
    let endIndex = 0;

    for (let i = 0; i < str.length; i++) {
        if (str.substring(i).startsWith('bread')) {
            count++;
            startIndex = i + 5;
            break;
        }
    }

    for (let i = str.length; i > startIndex; i--) {
        if (str.substring(0, i).endsWith('bread')) {
            count++;
            endIndex = i - 5;
            break;
        }
    }

    if (count === 2) {
        return str.substring(startIndex, endIndex);
    }

    return '';
};

console.log(getSandwich('breadjambread'));
console.log(getSandwich('xxbreadjambreadyy'));
console.log(getSandwich('xxbreadyy'));
