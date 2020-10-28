
// return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count
const mixStar = (str) => {

    return str.length > 2 && str.substring(1,3) === 'ix' ? true : false;

}

console.log(mixStar('mix snacks'));
console.log(mixStar('pix snacks'));
console.log(mixStar('piz snacks'));
