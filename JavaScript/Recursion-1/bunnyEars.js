
// we have a number of bunnies and each bunny has two big floppy ears
// we want to compute the total number of ears across all the bunnies recursively
const bunnyEars = (bunnies) => {
	if (bunnies === 0) {
		return 0;
	}

	return 2 + bunnyEars(bunnies - 1);
};

console.log(bunnyEars(0));
console.log(bunnyEars(1));
console.log(bunnyEars(2));
