
// given a string, compute recursively a new string where all the lowercase 'x' chars have been changed to 'y' chars
const changeXY = (str) => {
    if (!str) {
        return '';
    }

    return str[0] === 'x' ? 'y' + changeXY(str.substring(1)) : str[0] + changeXY(str.substring(1));
};

console.log(changeXY('codex'));
console.log(changeXY('xxhixx'));
console.log(changeXY('xhixhix'));
