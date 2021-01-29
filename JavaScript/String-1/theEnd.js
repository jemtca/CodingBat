
// given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back
// the string will be non-empty
const theEnd = (str, front) => {
    return front ? str[0] : str[str.length - 1];
};

console.log(theEnd('Hello', true));
console.log(theEnd('Hello', false));
console.log(theEnd('oh', true));
