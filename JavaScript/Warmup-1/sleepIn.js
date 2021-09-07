
// the parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation
// we sleep in if it is not a weekday or we're on vacation
// return true if we sleep in
const sleepIn = (weekday, vacation) => {
    return (!weekday || vacation) ? true : false;
};

console.log(sleepIn(false, false));
console.log(sleepIn(true, false));
console.log(sleepIn(false, true));
