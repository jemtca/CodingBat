
// given a string, we'll say that the front is the first 3 chars of the string
// if the string length is less than 3, the front is whatever is there
// return a new string which is 3 copies of the front
const front3 = (str) => {
	let front = '';

	if (str.length < 3) {
		front = str;
	} else {
		front = str.substring(0, 3);
	}

	return front + front + front;
};

console.log(front3('Java'));
console.log(front3('Chocolate'));
console.log(front3('abc'));
