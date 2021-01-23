
// given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside
// the strings will not be the same length, but they may be empty (length 0)
const comboString = (a, b) => {
    return a.length > b.length ? b + a + b : a + b + a;
};

console.log(comboString("Hello", "hi"));
console.log(comboString("hi", "Hello"));
console.log(comboString("aaa", "b"));
