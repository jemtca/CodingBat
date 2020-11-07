
// given a string, return a new string where the last 3 chars are now in upper case
// if the string has less than 3 chars, uppercase whatever is there
const endUp = (str) => {

    let newString = '';

    if (str.length < 3) {
        newString = str.toUpperCase();
    } else {
        newString = str.substring(0, str.length - 3) + str.substring(str.length - 3).toUpperCase();
    }

    return newString;

}

console.log(endUp('Hello'));
console.log(endUp('hi there'));
console.log(endUp('hi'));
