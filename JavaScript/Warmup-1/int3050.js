
// given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive
const int3050 = (a, b) => {
    return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40) || (a >= 40 && a <= 50) && (b >= 40 && b <= 50) ) ? true : false;
};

console.log(int3050(30, 31));
console.log(int3050(30, 41));
console.log(int3050(40, 50));
