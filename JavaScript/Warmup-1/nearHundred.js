
// given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number
const nearHundered = n => {

    return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10  ? true : false;

}

console.log(nearHundered(93));
console.log(nearHundered(90));
console.log(nearHundered(89));
