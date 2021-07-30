
// given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
// the second char of a, the second char of b, and so on
// any leftover chars go at the end of the result
const misString = (a, b) => {
    let biggerStr = '';
    let lengthA = a.length - 1;
    let lengthB = b.length - 1;

    for (let i = 0; i < Math.max(a.length, b.length); i++) {
        if (lengthA >= 0 && lengthB >= 0) {
            biggerStr = biggerStr + a[i] + b[i];
            lengthA--;
            lengthB--;
            continue;
        }

        if (lengthA >= 0) {
            biggerStr = biggerStr + a[i];
            lengthA--;
        }

        if (lengthB >= 0) {
            biggerStr = biggerStr + b[i];
            lengthB--;
        }
    }

    return biggerStr;
};

console.log(misString('abc', 'xyz'));
console.log(misString('Hi', 'There'));
console.log(misString('xxxx', 'There'));
