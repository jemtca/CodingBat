
// return true if the given string contains an appearance of 'xyz' where the xyz is not directly preceeded by a period (.)
// so 'xxyz' counts but 'x.xyz' does not
const xyzThere = (str) => {
    if (str.length === 3 && str === 'xyz') {
        return true;
    }

    for (let i = 0; i < str.length - 3; i++) {
        if (i === 0 && str.substring(i, i + 3) === 'xyz') {
            return true;
        } else {
            if (str[i] !== '.' && str.substring(i + 1, i + 4) === 'xyz') {
                return true;
            }
        }
    }

    return false;
};

console.log(xyzThere('abcxyz'));
console.log(xyzThere('abc.xyz'));
console.log(xyzThere('xyz.abc'));
