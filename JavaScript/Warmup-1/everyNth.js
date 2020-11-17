
// given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string
// so if N is 3, use char 0, 3, 6, ... and so on
// N is 1 or more
const everyNth = (str, n) => {
    let newStr = '';

    for (let i = 0; i < str.length; i = i + n) {
        newStr = newStr + str[i];
    }

    return newStr;
}

console.log(everyNth("Miracle", 2));
console.log(everyNth("abcdefg", 2));
console.log(everyNth("abcdefg", 3));
