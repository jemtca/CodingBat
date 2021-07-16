
// we want make a package of goal kilos of chocolate
// we have small bars (1 kilo each) and big bars (5 kilos each)
// return the number of small bars to use, assuming we always use big bars before small bars
// return -1 if it can't be done
const makeChocolate = (small, big, goal) => {
    const howManyBig = Math.min(big, goal / 5);
    const leftGoal = goal - (howManyBig * 5);

    return leftGoal <= small ? leftGoal : -1;
};

console.log(makeChocolate(4, 1, 9));
console.log(makeChocolate(4, 1, 10));
console.log(makeChocolate(4, 1, 7));
