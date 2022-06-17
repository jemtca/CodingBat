
// start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates
// return a new array containing the first N elements from the two arrays
// the result array should be in alphabetical order and without duplicates
// A and B will both have a length which is N or more
const mergeTwo = (a, b, n) => {
    let newArray = [];
    let count = 0;
    let index1 = 0;
    let index2 = 0;

    for (let i = 0; i < a.length + b.length; i++) {
        if (count === n) {
            break;
        } else {
            if (a[index1] < b[index2]) {
                newArray.push(a[index1]);
                count++;
                index1++;
            } else if (a[index1] > b[index2]) {
                newArray.push(b[index2]);
                count++;
                index2++;
            } else {
                newArray.push(a[index1]);
                count++;
                index1++;
                index2++;
            }
        }
    }

    return newArray;
};

console.log(mergeTwo(['a', 'c', 'z'], ['b', 'f', 'z'], 3));
console.log(mergeTwo(['a', 'c', 'z'], ['c', 'f', 'z'], 3));
console.log(mergeTwo(['f', 'g', 'z'], ['c', 'f', 'g'], 3));
