
// you have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2
// if they are all the value 2, the result is 10
// otherwise if they are all the same, the result is 5
// otherwise so long as both b and c are different from a, the result is 1
// otherwise the result is 0
const redTicket = (a, b, c) => {
    if (a === 2 && b === 2 && c === 2) {
        return 10;
    }

    if (a === b && b === c) {
        return 5;
    }

    if (a !== b && a !== c) {
        return 1;
    }

    return 0;
};

console.log(redTicket(2, 2, 2));
console.log(redTicket(2, 2, 1));
console.log(redTicket(0, 0, 0));
