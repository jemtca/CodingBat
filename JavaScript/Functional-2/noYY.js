
// given a list of strings
// return a list where each string has 'y' added at its end, omitting any resulting strings that contain 'yy' as a substring anywhere
const noYY = (strings) => {
    const newList1 = strings.map(n => n + 'y');
    const newList2 = newList1.filter(n => !n.includes('yy'));
    
    return newList2;
};

console.log(noYY(['a', 'b', 'c']));
console.log(noYY(['a', 'b', 'cy']));
console.log(noYY(['xx', 'ya', 'zz']));
