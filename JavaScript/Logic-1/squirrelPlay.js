
// the squirrels in Palo Alto spend most of the day playing
// in particular, they play if the temperature is between 60 and 90 (inclusive)
// unless it is summer, then the upper limit is 100 instead of 90
// given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise
const squirrelPlay = () => {
    return isSummer && temp >= 60 && temp <= 100 || !isSummer && temp >= 60 && temp <= 90 ? true : false;
};

console.log(squirrelPlay(70, false));
console.log(squirrelPlay(95, false));
console.log(squirrelPlay(95, true));
