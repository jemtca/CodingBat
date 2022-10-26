
// given a string, return recursively a 'cleaned' string where adjacent chars that are the same have been reduced to a single char
// so 'yyzzza' yields 'yza'
const stringClean = (str) => {
    if (!str) {
        return '';
    }

    return str.length > 1 && str[0] === str[1] ? stringClean(str.substring(1)) : str[0] + stringClean(str.substring(1));
};

console.log(stringClean('yyzzza'));
console.log(stringClean('abbbcdd'));
console.log(stringClean('Hello'));
