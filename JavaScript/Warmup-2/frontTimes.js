
// given a string and a non-negative int n
// we'll say that the front of the string is the first 3 chars or whatever is there if the string is less than length 3
// return n copies of the front
const frontTimes = (str, n) => {

    let newStr = '';

    if (str.length < 3) {
        for (let i = 0; i < n; i++) {
            newStr = newStr + str;
          }
    } else {
        for (let i = 0; i < n; i++) {
            newStr = newStr + str.substring(0,3);
        }
    }

    return newStr;

}

console.log(frontTimes('Chocolate', 2));
console.log(frontTimes('Chocolate', 3));
console.log(frontTimes('Abc', 3));
