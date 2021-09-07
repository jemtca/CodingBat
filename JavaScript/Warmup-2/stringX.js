
// given a string, return a version where all the 'x' have been removed
// except an 'x' at the very start or end should not be removed
const stringX = (str) => {
    let newMiddleString = '';
    
    if (str.length > 1) {
        for (let i = 1; i < str.length - 1; i++) {
            if (str[i] !== 'x') {
                newMiddleString = newMiddleString + str[i];
            }
        }
        return str[0] + newMiddleString + str[str.length - 1];
    } else {
        return str;
    }
};

console.log(stringX('xxHxix'));
console.log(stringX('abxxxcd'));
console.log(stringX('xabxxxcdx'));
