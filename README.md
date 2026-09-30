# Code Coverage Advancer

> **Course homework: Code Coverage - Homework 2.** Tuna Kodal, 221101024. This repository contains an assignment submission, not a production library.

The task was to raise the test coverage of a given Java project from 8% to 100% by writing JUnit tests, measuring coverage with JaCoCo and using Mockito for mocking where needed.

## Approach

- The project started with no tests and very low coverage (8%).
- JaCoCo reports were used to find untested branches.
- JUnit tests were added for `Compute` and `Util`, and Mockito mocks the `MessageQueue` interface that `Compute` depends on.
- Final result: 100% coverage of the classes under test (the sample `com.mycompany.app` package is excluded in `pom.xml`).

## Repository Structure

```
.
├── my-app/                              Maven project
│   ├── pom.xml                          JUnit, Mockito and JaCoCo configuration
│   └── src/
│       ├── main/java/                   Compute, Util, MessageQueue
│       └── test/java/                   TestCompute, TestUtil
├── Bakery_Sales_Dataset_Analysis.ipynb  separate data analysis notebook (unrelated to the homework)
└── README.md
```

## Usage

Requires JDK 19 and Maven.

```bash
cd my-app
mvn test
mvn package
```

The JaCoCo coverage report is generated at `my-app/target/site/jacoco/index.html` during `mvn package`.
