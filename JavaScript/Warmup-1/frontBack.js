
// given a string, return a new string where the first and last chars have been exchanged
const frontBack = (str) => {

    if (str.length < 2) {
        return str;
    } else {
        return str[str.length - 1] + str.substring(1, str.length - 1) + str[0]; 
    }

}

console.log(frontBack('code'));
console.log(frontBack('a'));
console.log(frontBack('ab'));
