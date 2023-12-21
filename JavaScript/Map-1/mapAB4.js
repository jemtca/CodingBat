
// modify and return the given map as follows: if the keys 'a' and 'b' have values that have different lengths, then set 'c' to have the longer value
// if the values exist and have the same length, change them both to the empty string in the map
const mapAB4 = (map) => {
    const myMap = new Map(Object.entries(map));

    if (myMap.has('a') && myMap.has('b')) {
        const lengthA = myMap.get('a').length;
        const lengthB = myMap.get('b').length;

        if (lengthA !== lengthB) {
            const max = lengthA > lengthB ? myMap.get('a') : myMap.get('b');
            myMap.set('c', max);
        } else {
            myMap.set('a', '');
            myMap.set('b', '');
        }
    }

    return myMap;
};

console.log(mapAB4({'a': 'aaa', 'b': 'bb', 'c': 'cake'}));
console.log(mapAB4({'a': 'aa', 'b': 'bbb', 'c': 'cake'}));
console.log(mapAB4({'a': 'aa', 'b': 'bbb'}));
