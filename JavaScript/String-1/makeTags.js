
// the web is built with HTML strings like '<i>Yay</i>' which draws Yay as italic text
// in this example, the 'i' tag makes <i> and </i> which surround the word 'Yay'
// given tag and word strings, create the HTML string with tags around the word
// e.g. '<i>Yay</i>'
const makeTags = (tag, word) => {
    return `<${tag}>${word}</${tag}>`;
};

console.log(makeTags('i', 'Yay'));
console.log(makeTags('i', 'Hello'));
console.log(makeTags('cite', 'Yay'));
