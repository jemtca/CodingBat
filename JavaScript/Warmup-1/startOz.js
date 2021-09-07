
// given a string, return a string made of the first 2 chars (if present)
// however include first char only if it is 'o' and include the second only if it is 'z', so 'ozymandias' yields 'oz'
const startOz = (str) => {
    let result = '';

    if (str.length >= 1 && str[0] === 'o') {
        result = result + 'o';
    }

    if (str.length >= 2 && str[1] === 'z') {
        result = result + 'z';
    }

    return result;
};

console.log(startOz('ozymandias'));
console.log(startOz('bzoo'));
console.log(startOz('oxx'));
