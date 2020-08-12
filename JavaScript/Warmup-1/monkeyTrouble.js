
// we have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling
// we are in trouble if they are both smiling or if neither of them is smiling
// return true if we are in trouble
const monkeyTrouble = (aSmile, bSmile) => {

    return ((aSmile && bSmile) || (!aSmile && !bSmile)) ? true : false;

}

console.log(monkeyTrouble(true, true));
console.log(monkeyTrouble(false, false));
console.log(monkeyTrouble(true, false));
