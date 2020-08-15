
// we have a loud talking parrot
// the "hour" parameter is the current hour time in the range 0..23
// we are in trouble if the parrot is talking and the hour is before 7 or after 20
// return true if we are in trouble
const parrotTrouble = (talking, hour) => {

    return (talking && (hour < 7 || hour > 20)) ? true : false;

}

console.log(parrotTrouble(true, 6));
console.log(parrotTrouble(true, 7));
console.log(parrotTrouble(false, 6));
