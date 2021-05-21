
// when squirrels get together for a party, they like to have cigars
// a squirrel party is successful when the number of cigars is between 40 and 60, inclusive
// unless it is the weekend, in which case there is no upper bound on the number of cigars
// return true if the party with the given values is successful, or false otherwise
const cigarParty = (cigars, isWeekend) => {
    return isWeekend && cigars >= 40 || !isWeekend && cigars >= 40 && cigars <= 60 ? true : false;
};

console.log(cigarParty(30, false));
console.log(cigarParty(50, false));
console.log(cigarParty(70, true));
