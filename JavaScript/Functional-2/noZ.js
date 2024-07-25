
// given a list of strings, return a list of the strings, omitting any string that contains a 'z'
const noZ = (strings) => {
    const newList = strings.filter(n => !n.includes('z'));

    return newList;
};

console.log(noZ(['aaa', 'bbb', 'aza']));
console.log(noZ(['hziz', 'hzello', 'hi']));
console.log(noZ(['hello', 'howz', 'are', 'youz']));
