
// given a string that contains a single pair of parenthesis
// compute recursively a new string made of only of the parenthesis and their contents
// so 'xyz(abc)123' yields '(abc)'
const parenBit = (str) => {
    if (str[0] !== '(') {
        return parenBit(str.substring(1));
    }

    if (str[str.length - 1] !== ')') {
        return parenBit(str.substring(0, str.length - 1));
    }

    return str;
};

console.log(parenBit('xyz(abc)123'));
console.log(parenBit('x(hello)'));
console.log(parenBit('(xy)1'));
