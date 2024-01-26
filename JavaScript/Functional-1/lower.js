
// given a list of strings, return a list where each string is converted to lower case
const lower = (strings) => {
    const newList = strings.map(n => n.toLowerCase());

    return newList;
};

console.log(lower(['Hello', 'Hi']));
console.log(lower(['AAA', 'BBB', 'ccc']));
console.log(lower(['KitteN', 'ChocolaTE']));
