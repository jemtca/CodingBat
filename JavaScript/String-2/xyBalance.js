
// we'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string
// so 'xxy' is balanced, but 'xyx' is not
// one 'y' can balance multiple 'x's
// return true if the given string is xy-balanced
const xyBalance = (str) => {
    for (let i = 0; i < str.length; i++) {
        if (str[i] === 'x' && !str.substring(i).includes('y')) {
            return false;
        }
    }

    return true;
};

console.log(xyBalance('aaxbby'));
console.log(xyBalance('aaxbb'));
console.log(xyBalance('yaaxbb'));
