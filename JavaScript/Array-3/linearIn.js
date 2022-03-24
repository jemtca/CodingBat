
// given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer
// the best solution makes only a single 'linear' pass of both arrays, taking advantage of the fact that both arrays are already in sorted order
const linearIn = (outer, inner) => {
    let found = false;

    for (let i = 0; i < inner.length; i++) {
        for (let j = 0; j < outer.length; j++) {
            if (inner[i] === outer[j]) {
                found = true;
                break;
            }
        }

        if (!found) {
            return false;
        } else {
            found = false;
        }
    }

    return true;
};

console.log(linearIn([1, 2, 4, 6], [2, 4]));
console.log(linearIn([1, 2, 4, 6], [2, 3, 4]));
console.log(linearIn([1, 2, 4, 4, 6], [2, 4]));
