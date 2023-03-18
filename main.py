# The program prints out all the numbers from 1 to 100000, but for multiples of 3, instead of the number, print "Fizz" and for multiples of 5 print "Buzz". For numbers which are multiples of both 3 and 5, print "FizzBuzz".

import time

start_time = time.time()

for i in range(1, 100001):
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz")
    else:
        print(i)

end_time = time.time()
print("Time taken: ", end_time - start_time)
