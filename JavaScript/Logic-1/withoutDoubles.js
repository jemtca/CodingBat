
// return the sum of two 6-sided dice rolls, each in the range 1..6
// however, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6
const withoutDoubles = (die1, die2, noDoubles) => {
     if (noDoubles && die1 === die2) {
        if (die1 <= 5) {
            die1++;
        } else {
            die1 = 1;
        }
    }

    return die1 + die2;
};

console.log(withoutDoubles(2, 3, true));
console.log(withoutDoubles(3, 3, true));
console.log(withoutDoubles(3, 3, false));
