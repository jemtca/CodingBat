
// given a list of strings, return a list where each string has all its 'x' removed
const noX = (strings) => {
    const newList = strings.map(n => n.replaceAll('x', ''));

    return newList;
};

console.log(noX(['ax', 'bb', 'cx']));
console.log(noX(['xxax', 'xbxbx', 'xxcx']));
console.log(noX(['x']));
