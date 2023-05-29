const reverseString = (str) => {
  const stringArray = str.split(' ');
  const reverseString = stringArray.reduce((finalStr, str) => {
    return finalStr + str.split('').reverse().join('') + ' ';
  }, '');
  return reverseString.trim();
};

console.log(reverseString('Cat'));
console.log(reverseString('The Daily Byte'));
console.log(reverseString('civic'));