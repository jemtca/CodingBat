
// given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21
const dif21 = (n) => {
    return n > 21 ? Math.abs(n - 21) * 2 : Math.abs(n - 21);
};

console.log(dif21(19));
console.log(dif21(10));
console.log(dif21(21));
