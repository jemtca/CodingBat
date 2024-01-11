
// we'll say that 2 strings 'match' if they are non-empty and their first chars are the same
// loop over and then return the given array of non-empty strings as follows:
// if a string matches an earlier string in the array, swap the 2 strings in the array
// a particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled
const firstSwap = (strings) => {
    const myMap1 = new Map();
    const myMap2 = new Map();

    for (let i = 0; i < strings.length; i++) {
        if (!myMap1.has(strings[i][0])) {
            myMap1.set(strings[i][0], i);
        } else {
            if (!myMap2.has(strings[i][0])) {
                let current = strings[i];
                let index = myMap1.get(strings[i][0]);
    
                strings[i] = strings[index];
                strings[index] = current;

                myMap2.set(strings[i][0], strings[i][0]);
            }
        }
    }

    return strings;
};

console.log(firstSwap(['ab', 'ac']));
console.log(firstSwap(['ax', 'bx', 'cx', 'cy', 'by', 'ay', 'aaa', 'azz']));
console.log(firstSwap(['ax', 'bx', 'ay', 'by', 'ai', 'aj', 'bx', 'by']));
