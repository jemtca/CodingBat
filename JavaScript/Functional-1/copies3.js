
// given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together
const copies3 = (strings) => {
    const newList = strings.map(n => n + n + n);

    return newList;
};

console.log(copies3(["a", "bb", "ccc"]));
console.log(copies3(["24", "a", ""]));
console.log(copies3(["hello", "there"]));
