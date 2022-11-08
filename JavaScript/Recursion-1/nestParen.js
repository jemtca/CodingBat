
// given a string, return true if it is a nesting of zero or more pairs of parenthesis, like '(())' or '((()))'
// suggestion: check the first and last chars, and then recur on what's inside them
const nestParen = (str) => {
	if (!str) {
		return true;
	}

	if (str[0] === '(' && str[str.length - 1] === ')') {
		return nestParen(str.substring(1, str.length - 1));
	}

	return false;
};

console.log(nestParen('(())'));
console.log(nestParen('((()))'));
console.log(nestParen('(((x))'));
