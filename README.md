# ScientifiCalc

ScientifiCalc is a Java scientific calculator project being developed incrementally through Agile sprints.

## Sprint 1

Sprint 1 focuses on the core calculator functionality:

- Basic arithmetic operations
- Power and square-root operations
- Power-of-two operation
- Console logging for operations and errors
- Initial JUnit 5 unit test suite
- Maven-based CI/CD test execution

**Sprint total:** 11 points

### User stories

- [Sprint 1 user stories in ClickUp](https://doc.clickup.com/9012594332/d/h/8ck2hmw-472/b6faf2ef7aea7d3)

### Sprint board

Click the image to open the Sprint 1 board in ClickUp.

[![Sprint 1 board](img.png)](https://sharing.clickup.com/9012594332/b/h/6-901223229977-2/69cccfa8c3f8e96)

[Open the Sprint 1 board directly](https://sharing.clickup.com/9012594332/b/h/6-901223229977-2/69cccfa8c3f8e96)

## Calculator operations

The `Calculator` class provides:

- `add`
- `subtract`
- `multiply`
- `divide`
- `power`
- `powerOfTwo`
- `squareRoot`

Division by zero and square roots of negative numbers are rejected with clear exceptions.
Successful operations and calculator errors are logged to the console using Java's built-in logging.

## Running the tests

Run the JUnit 5 test suite with Maven:

```bash
mvn test
```

The same command runs automatically in GitHub Actions for pushes and pull requests targeting `main`.
