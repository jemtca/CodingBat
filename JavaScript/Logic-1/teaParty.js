
// we are having a party with amounts of tea and candy
// return the int outcome of the party encoded as 0=bad, 1=good, or 2=great
// a party is good (1) if both tea and candy are at least 5
// however, if either tea or candy is at least double the amount of the other one, the party is great (2)
// however, in all cases, if either tea or candy is less than 5, the party is always bad (0)
const teaParty = (tea, candy) => {
    let result = 0;

    if (tea >= 5 && candy >= 5) {
        result = 1;
    }

    if (tea >= candy * 2 || candy >= tea * 2) {
        result = 2;
    }
    
    if (tea < 5 || candy < 5) {
        result = 0;
    }

    return result;
};

console.log(teaParty(6, 8));
console.log(teaParty(3, 8));
console.log(teaParty(20, 6));
