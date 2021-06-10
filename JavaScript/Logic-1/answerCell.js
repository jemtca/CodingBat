
// your cell phone rings
// return true if you should answer it
// normally you answer, except in the morning you only answer if it is your mom calling
// in all cases, if you are asleep, you do not answer
const answerCell = (isMorning, isMom, isAsleep) => {
    if (isAsleep || (isMorning && !isMom)) {
        return false;
    }

    return true;
};

console.log(answerCell(false, false, false));
console.log(answerCell(false, false, true));
console.log(answerCell(true, false, false));
