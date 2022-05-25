
// we'll say that a positive int divides itself if every digit in the number divides into the number evenly
// so for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly
// we'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself
const dividesSelf = (n) => {
    let newN = String(n);

    for (let i = 0; i < newN.length; i++) {
        if (Number(newN[i]) === 0 || (n % Number(newN[i]) !== 0)) {
            return false;
        }
    }

    return true;
};

// console.log(dividesSelf(128));
// console.log(dividesSelf(12));
// console.log(dividesSelf(120));

console.log(dividesSelf(32));
console.log(dividesSelf(42));
console.log(dividesSelf(213));
