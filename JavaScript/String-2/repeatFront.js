
// given a string and an int n, return a string made of the first n characters of the string
// followed by the first n-1 characters of the string, and so on
// you may assume that n is between 0 and the length of the string
const repeatFront = (str, n) => {
    let newStr = str.substring(0, n);
    let finalStr = '';

    for (let i = newStr.length; i > 0; i--) {
        finalStr = finalStr + newStr.substring(0, i);
    }

    return finalStr;
};

console.log(repeatFront('Chocolate', 4));
console.log(repeatFront('Chocolate', 3));
console.log(repeatFront('Ice Cream', 2));
