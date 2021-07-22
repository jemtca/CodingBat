
// return the number of times that the string 'code' appears anywhere in the given string
// except we'll accept any letter for the 'd', so 'cope' and 'cooe' count
const countCode = (str) => {
    let count = 0;

    for (let i = 0; i < str.length - 3; i++) {
        if (str.substring(i, i + 2) === 'co' && str[i + 3] === 'e') {
            count++;
        }
    }

    return count;
};

console.log(countCode('aaacodebbb'));
console.log(countCode('codexxcode'));
console.log(countCode('cozexxcope'));
