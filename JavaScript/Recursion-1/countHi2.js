
// given a string, compute recursively the number of times lowercase 'hi' appears in the string
// however do not count 'hi' that have an 'x' immedately before them
const countHi2 = (str) => {
    if (!str) {
        return 0;
    }

    if (str.length > 1 && str.substring(0, 2).toLowerCase() === 'hi') {
        return 1 + countHi2(str.substring(2));
    }

    if (str.length > 2 && str.substring(0, 3).toLowerCase() === 'xhi') {
        return countHi2(str.substring(3));
    }

    return countHi2(str.substring(1));
};

console.log(countHi2('ahixhi'));
console.log(countHi2('ahibhi'));
console.log(countHi2('xhixhi'));
