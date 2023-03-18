# Performance comparison
Performance comparation between [Go](https://golang.org/), [Java](https://www.java.com/), [Python](https://www.python.org/) and [Node.js](https://nodejs.org/).

The program prints out all the numbers from 1 to 100000, but for multiples of 3, instead of the number, print "Fizz" and for multiples of 5 print "Buzz". For numbers which are multiples of both 3 and 5, print "FizzBuzz".

## Go
### Installation
```bash
$ sudo apt-get install golang
```

### Run
```bash
$ go run main.go
```

## Java
### Installation
```bash
$ sudo apt-get install openjdk-8-jdk
```

### Run
```bash
$ java main.java
```

## Python
### Installation
```bash
$ sudo apt-get install python3
```

### Run
```bash
$ python3 main.py
```

## Node.js
### Installation
```bash
$ sudo apt-get install nodejs
```

### Run
```bash
$ node main.js
```

## Results
| Language | Time |
|----------|------|
| Go       | 266ms|
| Java     | 398ms|
| Python   | 351ms|
| Node.js  | 790ms|

## Conclusion
Go is the fastest language, followed by Python and Java. Node.js is the slowest language.
