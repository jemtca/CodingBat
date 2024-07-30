
// given a list of strings, return a list of the strings, omitting any string length 3 or 4
const no34 = (strings) => {
    const newList = strings.filter(n => n.length < 3 || n.length > 4);

    return newList;
};

console.log(no34(['a', 'bb', 'ccc']));
console.log(no34(['a', 'bb', 'ccc', 'dddd']));
console.log(no34(['ccc', 'dddd', 'apple']));
