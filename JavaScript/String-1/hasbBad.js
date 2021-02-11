
// given a string, return true if 'bad' appears starting at index 0 or 1 in the string, such as with 'badxxx' or 'xbadxx' but not 'xxbadxx'
// the string may be any length, including 0
const hasBad = (str) => {
    return ((str.length > 2 && str.substring(0, 3) === 'bad') || (str.length > 3 && str.substring(1, 4) === 'bad')) ? true : false;
};

console.log(hasBad('badxx'));
console.log(hasBad('xbadxx'));
console.log(hasBad('xxbadxx'));
