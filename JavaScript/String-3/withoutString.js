
// given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed
// you may assume that the remove string is length 1 or more
// remove only non-overlapping instances, so with 'xxx' removing 'xx' leaves 'x'
const withoutStream = (base, remove) => {
	const re = new RegExp(remove, 'gi');

	return base.replace(re, '');
};

console.log(withoutStream('Hello there', 'llo'));
console.log(withoutStream('Hello there', 'e'));
console.log(withoutStream('Hello there', 'x'));
