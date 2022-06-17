
// we have data for two users, A and B, each with a String name and an int id
// the goal is to order the users such as for sorting
// return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same
// order first by the string names, and then by the id numbers if the names are the same
const userCompare = (aName, aId, bName, bId) => {
    if (aName < bName) {
        return -1;
    } else if (aName > bName) {
        return 1;
    } else {
        if (aId < bId) {
            return -1;
        } else if (aId > bId) {
            return 1;
        } else {
            return 0;
        }
    }
};

console.log(userCompare('bb', 1, 'zz', 2));
console.log(userCompare('bb', 1, 'aa', 2));
console.log(userCompare('bb', 1, 'bb', 1));
