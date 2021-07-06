
// we want to make a row of bricks that is goal inches long
// we have a number of small bricks (1 inch each) and big bricks (5 inches each)
// return true if it is possible to make the goal by choosing from the given bricks
const makeBricks = (small, big, goal) => {
    if (small + big * 5 < goal) {
        return false;
    }

    if (goal % 5 > small) {
        return false;
    }

    return true;
};

console.log(makeBricks(3, 1, 8));
console.log(makeBricks(3, 1, 9));
console.log(makeBricks(3, 2, 10));
