
// given a string and an index, return a string length 2 starting at the given index
// if the index is too big or too small to define a string length 2, use the first 2 chars
// the string length will be at least 2
const twoChar = (str, index) => {
	return index < 0 || str.length - index < 2 ? str.substring(0, 2) : str.substring(index, index + 2);
};

console.log(twoChar('java', 0));
console.log(twoChar('java', 2));
console.log(twoChar('java', 3));
