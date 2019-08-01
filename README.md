# Java Interview Challenges

A collection of methods arrived at through TDD to prepare for possible Java challenges raised in an interview.

## TDD Procedure:

1.	Create a class.
2.	Create a test for that class (Alt+Enter).
3.	Allocate memory for the class in the test class (Challenges challenges;).
4.	Create a test method.
5.	Create a new instance of the class before each method (challenges = new Challenges();).
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