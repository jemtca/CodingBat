
// given a list of strings, return a list where each string has '*' added at its end
const addStar = (strings) => {
    const newList = strings.map(n => n + '*');

    return newList;
};

console.log(addStar(['a', 'bb', 'ccc']));
console.log(addStar(['hello', 'there']));
console.log(addStar(['*']));
