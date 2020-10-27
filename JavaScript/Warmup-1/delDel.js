
// given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted
// otherwise, return the string unchanged
const delDel = (str) => {

    return (str.length > 4 && str.substring(1,4)) === 'del' ? str[0] + str.substring(4) : str;

}

console.log(delDel('adelbc'));
console.log(delDel('adelHello'));
console.log(delDel('adedbc'));
