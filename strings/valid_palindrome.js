const validPalindrome = (str) => {
  str = str.toLowerCase();
  let i = 0,
    j = str.length - 1;

  while (i < j) {
    // if character is not an alphabet, skip it.
    while (i <= j && !/[a-zA-Z]/.test(str.charAt(i))) {
      ++i;
    }
    while (i <= j && !/[a-zA-Z]/.test(str.charAt(j))) {
      --j;
    }

    if (i > j) {
      return false;
    }

    const charA = str.charAt(i);
    const charB = str.charAt(j);

    if (charA !== charB) {
      return false;
    }

    i++;
    j--;
  }
  return true;
};

console.log(validPalindrome('level'));
console.log(validPalindrome('algorithm'));
console.log(validPalindrome('The quick brown fox jumps over the lazy dog.'));
console.log(validPalindrome('A man, a plan, a canal: Panama.'));
