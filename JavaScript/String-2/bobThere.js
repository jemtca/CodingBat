
// return true if the given string contains a 'bob' string, but where the middle 'o' char can be any char
const bobThere = (str) => {
    for (let i = 0; i < str.length - 2; i++) {
        if (str[i] === 'b' && str[i + 2] === 'b') {
            return true;
        }
    }

    return false;
};

console.log(bobThere('abcbob'));
console.log(bobThere('b9b'));
console.log(bobThere('bac'));
