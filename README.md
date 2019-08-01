# Java Interview Challenges

A collection of methods arrived at through TDD to prepare for possible Java challenges raised in an interview.

## TDD Procedure:

1.	Create a class.
2.	Create a test for that class (Alt+Enter).
3.	Declare the class in the test class (Challenges challenges;).
4.	Create a test method.
5.	Initialize a new instance of the class before each method (challenges = new Challenges();).
6.	Create a failing test.
7.	Simulate the desired return of your class to make the test pass.
8.	Refactor your class to produce the desired return.

## Arrange, Act, Assert

This is the process of how we write the tests themselves.

* Arrange - Create objects and test data: Challenges challenges = new Challenges();
* Act - Create the actions you want to test (call your method): int result = challanges.sum();
* Assert - Check that the right things have happened: assertThat(result, is(4));

## Red, Green, Refactor

* Red - Write a failing test (to check against a false positive).
* Green - Write minimal pass.
* Refactor - Implement client requirements.

## Shortcuts

| Keystroke      | Description |
| ----------- | ----------- |
| Alt+Enter | Create test from class, create method from test |
| Alt+Insert| Generate Constructor, Getters / Setters, Test, etc. |
| Alt+Shift+Click | Multiple Cursors |
| Alt+J | Select next occurrence |
| Alt+Shift+ J | Unselect this occurrence |
| Ctrl+Shift+Alt+J | Select all occurrences |
| Shift+F10 | Run |

## Challenges

### [FizzBuzz](https://www.youtube.com/watch?v=h36mQC3JFMo&list=PLqq-6Pq4lTTZgXnsBNQwCWdKR6O6Cgk1Z)

#### [Requirements](https://www.hackerrank.com/challenges/fizzbuzz/problem)

``` bash
Write a short program that prints each number from 1 to 100 on a new line.

For each multiple of 3, print "Fizz" instead of the number.

For each multiple of 5, print "Buzz" instead of the number.

For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
```

#### Pseudo Code

``` bash
for i = 1 to n
    if i % 3 AND i % 5 == 0, "FizzBuzz"
    else if i % 3 == 0, "Fizz"
    else if i % 5 == 0, "Buzz"
    else print i
```

### [Two Sum](https://www.youtube.com/watch?v=TcsYEnMrnFo&list=PLqq-6Pq4lTTZgXnsBNQwCWdKR6O6Cgk1Z&index=2)

#### [Requirements](https://leetcode.com/problems/two-sum/)

``` bash
Write a short program that prints each number from 1 to 100 on a new line.

For each multiple of 3, print "Fizz" instead of the number.

For each multiple of 5, print "Buzz" instead of the number.

For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
```

#### Pseudo Code

``` bash
for i = 1 to n
    if i % 3 AND i % 5 == 0, "FizzBuzz"
    else if i % 3 == 0, "Fizz"
    else if i % 5 == 0, "Buzz"
    else print i
```