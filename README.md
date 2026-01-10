# ☕ Java Programming Journey: Core to Advanced

Welcome to your comprehensive Java learning repository! This project takes you from fundamental concepts to advanced programming techniques, with practical examples and hands-on code.

## 📚 About This Repository

This repository is designed as a progressive learning path for Java developers at any level. Whether you're just starting out or looking to master advanced concepts, you'll find well-structured, documented code examples that build upon each other.

## 🎯 Learning Path

### Core Concepts
Master the fundamentals of Java programming with practical examples:

- **Conditional Logic**: Learn decision-making structures
- **User Input Handling**: Work with Scanner and data input
- **Control Flow**: Understand if-else statements and logical operators
- **Mathematical Operations**: Apply arithmetic and modulo operations

### Current Projects

#### 1. Number Comparison Tool
**File**: `CheckGreatestOfThreeNumbers.java`

Compare three numbers and identify the greatest value. This project demonstrates conditional logic and comparison operators.

**Key Concepts**: Nested conditionals, logical operators, user input

#### 2. Armstrong Number Validator
**File**: `CheckingArmstrong.java`

Check if a number equals the sum of its digits raised to the power of the number of digits. Includes helper methods for digit-counting and custom exponentiation.

**Key Concepts**: Digit manipulation, custom power function, mathematical validation

#### 3. Prime Number Tester
**File**: `CheckingPrimeNo.java`

Determine whether a given integer is prime. Uses an optimized trial-division loop that exits early on factors.

**Key Concepts**: Trial division, early-exit loops, boundary cases (1, 2, 3)

#### 4. Leap Year Calculator
**File**: `CheckLeapYear.java`

Decide if a year is a leap year via the full Gregorian-calendar rules (divisible by 4, 100, and 400).

**Key Concepts**: Modulo arithmetic, compound boolean conditions, calendar mathematics

#### 5. Even/Odd Checker
**File**: `CheckOldAndEven.java`

Classify an integer as even or odd with the modulo operator.

**Key Concepts**: Modulo arithmetic, single conditional, user interaction

#### 6. Bit-Level Even/Odd Checker
**File**: `CheckOldEvenByBitWise.java`

Same task as above, but uses bitwise AND (`& 1`) for instantaneous parity detection.

**Key Concepts**: Bitwise operations, low-level optimization

#### 7. Sign Detector
**File**: `CheckPositiveAndNegative.java`

Report whether a number is positive, negative, or zero.

**Key Concepts**: Relational operators, three-way branching

#### 8. Factorial Computer
**File**: `FactorialOfNumber.java`

Compute n! iteratively for any non-negative integer supplied by the user.

**Key Concepts**: Iterative accumulation, factorial definition, input validation

#### 9. GCD Finder
**File**: `FindGCDofNumbers.java`

Calculate the greatest common divisor of two integers with a decrement-and-test algorithm.

**Key Concepts**: Common divisor logic, pairwise comparison, iterative search

#### 10. LCM Finder
**File**: `FindingLCMOfNumbers.java`

Determine the least common multiple by scanning upward from the larger number until a shared multiple appears.

**Key Concepts**: Multiple scanning, multiplication properties, edge-case handling (≤ 0)

#### 11. Fibonacci Series Generator
**File**: `PrintingFibonacci.java`

Output the Fibonacci sequence up to the largest value not exceeding the user-supplied limit.

**Key Concepts**: Sequence generation, string concatenation, loop control

#### 12. Star-Pattern Printer
**File**: `PrintingStarPatterns.java`

Draw two styles of text-based star triangles—incremental-width and decremental-width—based on user input.

**Key Concepts**: Nested loops, string building, console graphics

#### 13. Multiplication Table Printer
**File**: `PrintMultiplicationTable.java`

Display the 1-to-10 multiplication table for any given number.

**Key Concepts**: Loop-driven tables, formatted console output

#### 14. Digit Reverser
**File**: `ReverseDigitsOfNumbers.java`

Reverse the decimal digits of an integer using place-value multiplication.

**Key Concepts**: Place-value decomposition, custom power-of-ten helper, long-return safety

#### 15. Sum of Odd Numbers
**File**: `SumAllOldTillNumber.java`

Add every odd integer from 1 up to and including the user’s input.

**Key Concepts**: Arithmetic progression, step-2 iteration, accumulator pattern

#### 16. Digit-Sum Calculator
**File**: `SumOfDigits.java`

Sum all individual digits of an integer.

**Key Concepts**: Digit extraction, modulo/divide loop, additive accumulation

#### 17. Array Sorted Checker
**File**: `CheckArraySorted.java`

Determines whether an array of integers is sorted in ascending order. Uses a single pass to compare adjacent elements.

**Key Concepts**: array traversal, comparison operators, early return

#### 18. Array Element Deleter
**File**: `DeleteNumberFromArray.java`

Removes every occurrence of a specified number from an array and returns a new compacted array. Counts occurrences first to size the result array correctly.

**Key Concepts**: array resizing, occurrence counting, filtering

#### 19. Max Finder
**File**: `FindingMinAndMaxNo.java`

Finds the maximum value in an array by treating each element as a candidate and comparing it against all others. (Note: method name says “MinAndMax” but only max is implemented.)

**Key Concepts**: nested loops, array comparison, linear search

#### 20. Occurrence Counter
**File**: `FindOccuranceOfNumber.java`

Counts how many times a user-specified number appears in an array. Straightforward linear scan with a counter.

**Key Concepts**: linear search, counters, user input

#### 21. Array Reverser
**File**: `ReverseArray.java`

Creates a new array whose elements are the original array’s values in reverse order. Leaves the original array unchanged.

**Key Concepts**: array indexing, in-place vs copy, iteration

#### 22. Sum & Average Calculator
**File**: `SumAndAvgOfArray.java`

Calculates the total sum and arithmetic mean of an integer array, outputting both as a long and a double. Uses a long accumulator to reduce overflow risk.

**Key Concepts**: accumulator pattern, type casting, average computation

#### 23. Occurrence Checker
**File**: `CheckOccureneceOfNumber.java`

Counts how many times a user-specified number appears in an array. Uses an enhanced for-loop for concise traversal.

**Key Concepts**: linear search, counters, enhanced for-loop

#### 24. Prime Tester
**File**: `CheckPrimeByForLoop.java`

Checks whether a given integer is prime by attempting division from 2 up to n-1. Reports primality based on any successful division.

**Key Concepts**: primality test, divisibility, flag counting

#### 25. Input-Driven Loop Exit
**File**: `ExitLoopByInput.java`

Repeats echoing user input until the exact word “exit” (case-insensitive) is entered. Demonstrates do-while with string comparison.

**Key Concepts**: do-while loop, string comparison, sentinel value

#### 26. Max Finder (For-Loop)
**File**: `FindingMaxByForLoop.java`

Scans an array once to find and return the largest value. Initializes max with the first element to avoid empty-array pitfalls.

**Key Concepts**: linear scan, max tracking, defensive programming

#### 27. Multiplication Table
**File**: `MultipleTableByForLoop.java`

Prints the 1-to-10 multiplication table for any user-supplied integer. Classic nested-loop replacement with a single for-loop.

**Key Concepts**: arithmetic formatting, loops, console output

#### 28. Number Guessing Game
**File**: `NumberGuessingGame.java`

Keeps prompting the user to guess the fixed number 5 until successful. Simple do-while loop with bounded input range.

**Key Concepts**: sentinel loop, user feedback, fixed target

#### 29. Numeric Password Validator
**File**: `PasswordChecker.java`

Accepts only numeric passwords greater than 999 999, repeatedly prompting until the constraint is met. Treats the password as an integer.

**Key Concepts**: input validation, do-while loop, numeric constraints

#### 30. Fibonacci Series Printer
**File**: `PrintingFabonnacciSeries.java`

Prints the first n Fibonacci numbers via a recursive helper function. Demonstrates exponential recursion without memoization.

**Key Concepts**: recursion, Fibonacci sequence, exponential complexity

#### 31. Even-Number Filter
**File**: `PrintOnlyEvenFromArray.java`

Traverses an array and prints only the even values, counting how many it found. Reports “NO ONE” if no evens exist.

**Key Concepts**: filtering, modulo operator, conditional output

#### 32. Positive-Number Summer
**File**: `SumOfAllPositiveNo.java`

Sums all non-negative integers in an array, skipping negatives with a continue statement. Returns 0 if no positives are present.

**Key Concepts**: accumulator, conditional summation, continue statement

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A text editor or IDE (IntelliJ IDEA, Eclipse, VS Code recommended)
- Basic understanding of programming concepts

### Running the Programs

1. Clone this repository:
```bash
git clone https://github.com/umairdev010/Java_Practice_Projects
cd Java_Practice_Projects
```

2. Compile any Java file:
```bash
javac FileName.java
```

3. Run the compiled program:
```bash
java FileName
```

## 📖 How to Use This Repository

1. **Start with Core Concepts**: Begin with the simpler programs to understand Java syntax and structure
2. **Practice Each Example**: Don't just read—type out and run each program
3. **Experiment**: Modify the code to see how changes affect behavior
4. **Progress Gradually**: Move to more complex topics as you master the basics

## 🛠️ Project Structure

```
├── Core Concepts/
│   ├── CheckPositiveAndNegative.java
│   ├── CheckOldAndEven.java
│   ├── CheckGreatestOfThreeNumbers.java
│   └── CheckLeapYear.java
├── (More sections coming soon)
└── README.md
```

## 🎓 Learning Objectives

By working through this repository, you will:

- Understand Java syntax and structure
- Master control flow and decision-making
- Handle user input effectively
- Write clean, readable code
- Build problem-solving skills
- Progress from basic to advanced concepts

## 🤝 Contributing

Contributions are welcome! If you'd like to add new examples or improve existing ones:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/NewConcept`)
3. Commit your changes (`git commit -m 'Add new concept'`)
4. Push to the branch (`git push origin feature/NewConcept`)
5. Open a Pull Request

## 📝 Code Style Guidelines

- Use meaningful variable names
- Add comments for complex logic
- Follow Java naming conventions
- Keep methods focused and concise
- Include proper error handling

## 🗺️ Roadmap

### Coming Soon

- **Object-Oriented Programming**: Classes, objects, inheritance, polymorphism
- **Data Structures**: Arrays, ArrayLists, LinkedLists, HashMaps
- **Exception Handling**: Try-catch blocks, custom exceptions
- **File I/O**: Reading and writing files
- **Multithreading**: Concurrent programming concepts
- **Collections Framework**: Advanced data structure usage
- **Java 8+ Features**: Lambdas, streams, functional programming
- **Design Patterns**: Common software design solutions

## 📫 Contact & Support

Have questions or suggestions? Feel free to:

- Open an issue in this repository
- Submit a pull request with improvements
- Share your learning journey

## 📄 License

This project is open source developed by Umair and available for educational purposes.

---
**Happy Coding!** ☕💻

*Remember: The best way to learn programming is by writing code. Start simple, practice daily, and gradually tackle more complex challenges.*