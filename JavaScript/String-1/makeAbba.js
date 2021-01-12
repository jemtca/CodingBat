
// given two strings, a and b, return the result of putting them together in the order abba
// e.g. 'Hi' and 'Bye' returns 'HiByeByeHi'
const makeAbba = (a, b) => {
    return a + b + b + a;
};

console.log(makeAbba('Hi', 'Bye'));
console.log(makeAbba('Yo', 'Alice'));
console.log(makeAbba('What', 'Up'));
