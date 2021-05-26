
// you are driving a little too fast, and a police officer stops you
// write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket
// if speed is 60 or less, the result is 0
// if speed is between 61 and 80 inclusive, the result is 1
// if speed is 81 or more, the result is 2
// unless it is your birthday -- on that day, your speed can be 5 higher in all cases
const caughtSpeeding = (speed, isBirthday) => {
	if (speed <= 60 || speed <= 65 && isBirthday) {
		return 0;
	} else if (speed > 60 && speed <= 80 || speed > 65 && speed <= 85 && isBirthday) {
		return 1;
	} else {
		return 2;
	}
};

console.log(caughtSpeeding(60, false));
console.log(caughtSpeeding(65, false));
console.log(caughtSpeeding(65, true));
