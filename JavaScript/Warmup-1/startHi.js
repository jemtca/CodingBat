
// given a string, return true if the string starts with 'hi' and false otherwise
const startHi = (str) => {
    return str.startsWith('hi'.toLowerCase()) ? true : false;
};

console.log(startHi('hi there'));
console.log(startHi('hi'));
console.log(startHi('hello hi'));
