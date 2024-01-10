
// we'll say that 2 strings 'match' if they are non-empty and their first chars are the same
// loop over and then return the given array of non-empty strings as follows:
// if a string matches an earlier string in the array, swap the 2 strings in the array
// when a position in the array has been swapped, it no longer matches anything
const allSwap = (strings) => {
    const myMap = new Map();

    for (let i = 0; i < strings.length; i++) {
        if (!myMap.has(strings[i][0])) {
            myMap.set(strings[i][0], i);
        } else {
            let current = strings[i];
            let index = myMap.get(strings[i][0]);
            
            strings[i] = strings[index];
            strings[index] = current;

            myMap.delete(strings[i][0]);
        }
    }

    return strings;
};

console.log(allSwap(['ab', 'ac']));
console.log(allSwap(['ax', 'bx', 'cx', 'cy', 'by', 'ay', 'aaa', 'azz']));
console.log(allSwap(['ax', 'bx', 'ay', 'by', 'ai', 'aj', 'bx', 'by']));
