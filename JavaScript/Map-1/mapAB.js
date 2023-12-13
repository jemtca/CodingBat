
// modify and return the given map as follows: for this problem the map may or may not contain the 'a' and 'b' keys
// if both keys are present, append their 2 string values together and store the result under the key 'ab'
const mapAB = (map) => {
    const myMap = new Map(Object.entries(map));

    if (myMap.has('a') && myMap.has('b')) {
        myMap.set('ab', myMap.get('a') + myMap.get('b'));
    }

    return myMap;
};

console.log(mapAB({'a': 'Hi', 'b': 'There'}));
console.log(mapAB({'a': 'Hi'}));
console.log(mapAB({'b': 'There'}));
