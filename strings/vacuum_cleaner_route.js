const vacuumCleanerRoute = (str) => {
  let vertical = 0;
  let horizontal = 0;

  str.split('').map((char) => {
    if (char === 'L' || char === 'U') {
      if (char === 'L') {
        horizontal += 1;
      }

      if (char === 'U') {
        vertical += 1;
      }
    }

    if (char === 'R' || char === 'D') {
      if (char === 'R') {
        horizontal -= 1;
      }

      if (char === 'D') {
        vertical -= 1;
      }
    }
  });
  return horizontal - vertical === 0;
};

console.log(vacuumCleanerRoute('LR'));
console.log(vacuumCleanerRoute('URURD'));
console.log(vacuumCleanerRoute('RUULLDRD'));
