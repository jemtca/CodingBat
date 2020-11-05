
// return true if the given string contains between 1 and 3 'e' chars
const stringE = (str) => {

    // modifiers: g = global search, i = case-insensitive
    return (str.match(/e/gi) || []).length >= 1 && (str.match(/e/g) || []).length <= 3 ? true : false;

}

console.log(stringE('Hello'));
console.log(stringE('Heelle'));
console.log(stringE('Heelele'));
