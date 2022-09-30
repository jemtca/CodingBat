
// given a string, compute recursively a new string where all appearances of 'pi' have been replaced by '3.14'
const changePi = (str) => {
    if (!str) {
        return '';
    }

    return str.substring(0, 2) === 'pi' ? '3.14' + changePi(str.substring(2)) : str[0] + changePi(str.substring(1));
};

console.log(changePi('xpix'));
console.log(changePi('pipi'));
console.log(changePi('pip'));
