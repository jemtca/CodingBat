
// modify and return the given map as follows: if the key 'a' has a value, set the key 'b' to have that same value
// in all cases remove the key 'c', leaving the rest of the map unchanged
const mapShare = (map) => {
    let myMap = new Map(Object.entries(map));

    if (myMap.has('a')) {
        myMap.set('b', myMap.get('a'));
    }

    if (myMap.has('c')) {
        myMap.delete('c');
    }

    return myMap;
};

console.log(mapShare({'a': 'aaa', 'b': 'bbb', 'c': 'ccc'}));
console.log(mapShare({'b': 'xyz', 'c': 'ccc'}));
console.log(mapShare({'a': 'aaa', 'c': 'meh', 'd': 'hi'}));
