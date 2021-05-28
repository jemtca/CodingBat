
// given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation
// return a string of the form '7:00' indicating when the alarm clock should ring
// weekdays, the alarm should be '7:00' and on the weekend it should be '10:00'
// unless we are on vacation -- then on weekdays it should be '10:00' and weekends it should be 'off'
const alarmClock = (day, vacation) => {
	if (day >= 1 && day <= 5 && !vacation) {
		return '7:00';
	} else if (day >= 1 && day <= 5 && vacation) {
		return '10:00';
	} else if ((day === 6 || day === 0) && !vacation) {
		return '10:00';
	} else {
		return 'off';
	}
};

console.log(alarmClock(1, false));
console.log(alarmClock(5, false));
console.log(alarmClock(0, false));
