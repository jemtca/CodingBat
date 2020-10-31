
// given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie
const close10 = (a, b) => {

    if (Math.abs(10 - a) < Math.abs(10 - b)) {
        return a;
    } else if (Math.abs(10 - a) > Math.abs(10 - b)) {
        return b;
    } else {
        return 0;
    }

}

console.log(close10(8, 13));
console.log(close10(13, 8));
console.log(close10(13, 7));
