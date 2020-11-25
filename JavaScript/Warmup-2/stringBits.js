
// given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo"
const stringBits = (str) => {

    let newStr = '';

    for (let i = 0; i < str.length; i = i + 2) {
        newStr = newStr + str[i];
    }

    return newStr;

};

console.log(stringBits('Hello'));
console.log(stringBits('Hi'));
console.log(stringBits('Heeololeo'));
