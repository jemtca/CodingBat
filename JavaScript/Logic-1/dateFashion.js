
// you and your date are trying to get a table at a restaurant
// the parameter 'you' is the stylishness of your clothes, in the range 0..10, and 'date' is the stylishness of your date's clothes
// the result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes
// if either of you is very stylish, 8 or more, then the result is 2 (yes)
// with the exception that if either of you has style of 2 or less, then the result is 0 (no)
// otherwise the result is 1 (maybe)
const dateFashion = (you, date) => {
    if (you <= 2 || date <= 2) {
        return 0;
    }

    if (you >= 8 || date >= 8) {
        return 2;
    }

    return 1;
};

console.log(dateFashion(5, 10));
console.log(dateFashion(5, 2));
console.log(dateFashion(5, 5));
