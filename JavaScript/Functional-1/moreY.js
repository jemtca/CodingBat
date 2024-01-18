
// given a list of strings, return a list where each string has 'y' added at its start and end
const moreY = (strings) => {
    const newList = strings.map(n => 'y' + n + 'y');

    return newList;
};

console.log(moreY(['a', 'b', 'c']));
console.log(moreY(['hello', 'there']));
console.log(moreY(['yay']));
