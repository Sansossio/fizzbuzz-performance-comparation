// The program prints out all the numbers from 1 to 100000, but for multiples of 3, instead of the number, print "Fizz" and for multiples of 5 print "Buzz". For numbers which are multiples of both 3 and 5, print "FizzBuzz".

console.time('fizzbuzz');
for (let i = 1; i <= 100000; i++) {
  if (i % 3 === 0 && i % 5 === 0) {
    console.log('FizzBuzz');
    continue;
  }
  if (i % 3 === 0) {
    console.log('Fizz');
    continue;
  }
  if (i % 5 === 0) {
    console.log('Buzz');
    continue;
  }
  console.log(i);
}
console.timeEnd('fizzbuzz');
