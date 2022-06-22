
// start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates
// return the count of the number of strings which appear in both arrays
const commonTwo = (a, b) => {
    let count = 0;

    for (let i = 0; i < a.length; i++) {
        if (i < a.length - 1 && a[i] === a[i + 1]) {
            continue;
        } else {
            for (let j = 0; j < b.length; j++) {
                if (a[i] === b[j]) {
                    count++;
                    break;
                }
            }
        }
    }

    return count;
};

console.log(commonTwo(['a', 'c', 'x'], ['b', 'c', 'd', 'x']));
console.log(commonTwo(['a', 'c', 'x'], ['a', 'b', 'c', 'x', 'z']));
console.log(commonTwo(['a', 'b', 'c'], ['a', 'b', 'c']));
