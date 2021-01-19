
// given a string, return the string made of its first two chars, so the String 'Hello' yields 'He'
// if the string is shorter than length 2, return whatever there is, so 'X' yields 'X', and the empty string ' yields the empty string '
// note that str.length() returns the length of a string
const firstTwo = (str) => {
	return str.length > 2 ? str.substring(0, 2) : str;
};

console.log(firstTwo('Hello'));
console.log(firstTwo('abcdefg'));
console.log(firstTwo('ab'));
