
# Async Performance Demo with Log4j2

This Java application demonstrates the performance difference between synchronous and asynchronous logging using Log4j2.

## Introduction

The `AsyncPerformanceDemo` Java class showcases the efficiency of asynchronous logging compared to synchronous logging. It measures the time taken for both logging methods and provides insights into the potential performance improvements achieved by leveraging asynchronous logging techniques.

## Requirements

- Java Development Kit (JDK) 17 or higher
- Apache Maven (for building the project)

## Usage

1. Clone the repository or download the source code.
2. Navigate to the project directory.
3. Compile the Java class and package the application using Maven:

```bash
mvn clean package
```

4. Run the compiled Java application:

```bash
java -cp target/async-logging-demo.jar AsyncPerformanceDemo
```

## Log4j2 Configuration

The project utilizes a Log4j2 configuration file named `log4j2.xml` to define logging behavior. This XML file specifies two appenders: `RandomAccessFile` for logging to a file and `Console` for logging to the system console. Asynchronous logging is configured to improve application responsiveness.

This project is licensed under the [MIT License](LICENSE).

---