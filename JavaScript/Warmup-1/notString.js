
// given a string, return a new string where "not " has been added to the front
// however, if the string already begins with "not", return the string unchanged

const notString = (str) => {

    if (str.startsWith('not')) {
        return str;
    } else {
        return 'not ' + str;
    }

}

console.log(notString('candy'));
console.log(notString('x'));
console.log(notString('not bad'));
