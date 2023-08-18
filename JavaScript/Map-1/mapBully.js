
// modify and return the given map as follows: if the key 'a' has a value, set the key 'b' to have that value, and set the key 'a' to have the value ''
// basically 'b' is a bully, taking the value and replacing it with the empty string
const mapBully = (map) => {
    const myMap = new Map(Object.entries(map));

    if (myMap.has('a')) {
        myMap.set('b', myMap.get('a'));
        myMap.set('a', '');
    }

    return myMap;
};

console.log(mapBully({'a': 'candy', 'b': 'dirt'}));
console.log(mapBully({'a': 'candy'}));
console.log(mapBully({'a': 'candy', 'b': 'carrot', 'c': 'meh'}));
