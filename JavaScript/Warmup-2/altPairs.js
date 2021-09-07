
// given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so 'kittens' yields 'kien'
const altPairs = (str) => {
    let newStr = '';

    for (let i = 0; i < str.length; i = i + 4) {
        let end = i + 2;

        if (end > str.length) {
            end = str.length;
        }

        newStr = newStr + str.substring(i, end);
    }

    return newStr;
};

console.log(altPairs('kitten'));
console.log(altPairs('Chocolate'));
console.log(altPairs('CodingHorror'));
