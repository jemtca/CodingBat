
// suppose the string "yak" is unlucky
// given a string, return a version where all the "yak" are removed, but the "a" can be any char
// the "yak" strings will not overlap
const stringYak = (str) => {

    let newStr = '';

    if (str.length > 2) {
        for (let i = 0; i < str.length; i++) {
            if (str.substring(i).length > 2 && str[i].toLowerCase() === 'y' && str[i + 2].toLowerCase() === 'k') {
                i = i + 2;
            } else {
                newStr = newStr + str[i];
            }
        }
    } else {
        newStr = str;
    }

    return newStr;

};

console.log(stringYak('yakpak'));
console.log(stringYak('pakyak'));
console.log(stringYak('yak123ya'));
