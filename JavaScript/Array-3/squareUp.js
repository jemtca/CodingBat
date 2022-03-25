
// given n>=0, create an array length n*n with the following pattern
// shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups)
const squareUp = (n) => {
    let array = [];

    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            if (j < n - i - 1) {
                array[i * n + j] = 0;
                continue;
            }
            array[i * n + j] = n - j;
        }
    }

    return array;
};

console.log(squareUp(3));
console.log(squareUp(2));
console.log(squareUp(4));
