
// given a string and an int n, return a string made of n repetitions of the last n characters of the string
// you may assume that n is between 0 and the length of the string, inclusive
const repeatEnd = (str, n) => {
    let newStr = str.substring(str.length - n);
    let finalStr = '';

    for (let i = 0; i < n; i++) {
        finalStr = finalStr + newStr;
    }

    return finalStr;
};

console.log(repeatEnd('Hello', 3));
console.log(repeatEnd('Hello', 2));
console.log(repeatEnd('Hello', 1));
