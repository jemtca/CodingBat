
// given a string and a non-empty substring sub
// compute recursively the number of times that sub appears in the string, without the sub strings overlapping
const strCount = (str, sub) => {
    if (!str) {
        return 0;
    }

    return str.length >= sub.length && str.substring(0, sub.length) === sub ? 1 + strCount(str.substring(sub.length), sub) : strCount(str.substring(1), sub);
};

console.log(strCount('catcowcat', 'cat'));
console.log(strCount('catcowcat', 'cow'));
console.log(strCount('catcowcat', 'dog'));
