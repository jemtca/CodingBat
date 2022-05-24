
// given a positive int n, return true if it contains a 1 digit
// Note: use % to get the rightmost digit, and / to discard the rightmost digit
const hasOne = (n) => {
    let length = String(n).length;

    for (let i = 0; i < length; i++) {
        if (n % 10 === 1) {
            return true;
        }

        n = Math.floor(n / 10);
    }

    return false;
};

console.log(hasOne(10));
console.log(hasOne(22));
console.log(hasOne(220));
