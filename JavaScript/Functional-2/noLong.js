
// given a list of strings, return a list of the strings, omitting any string length 4 or more
const noLong = (strings) => {
    const newList = strings.filter(n => n.length < 4);

    return newList;
};

console.log(noLong(['this', 'not', 'too', 'long']));
console.log(noLong(['a', 'bbb', 'cccc']));
console.log(noLong(['cccc', 'cccc', 'cccc']));
