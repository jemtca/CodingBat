
// you have a green lottery ticket, with ints a, b, and c on it
// if the numbers are all different from each other, the result is 0
// if all of the numbers are the same, the result is 20
// if two of the numbers are the same, the result is 10
const greenTicket = (a, b, c) => {
    if (a === b && b === c) {
        return 20;
    }

    if (a === b || a === c || b === c) {
        return 10;
    }

    return 0;
};

console.log(greenTicket(1, 2, 3));
console.log(greenTicket(2, 2, 2));
console.log(greenTicket(1, 1, 2));
