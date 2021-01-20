
// given a string of even length, return the first half
// so the string "WooHoo" yields "Woo"
const firstHalf = (str) => {
    return str.substring(0, str.length / 2);
};

console.log(firstHalf('WooHoo'));
console.log(firstHalf('HelloThere'));
console.log(firstHalf('abcdef'));
