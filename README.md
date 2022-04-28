# spring-cloud-functions

This is an application to run spring cloud functions locally on system

## API Reference

### 1. Function<T,R> Interface

- it is a functional interface present in the java.util package.
- it is introduced in java 8.
- it is mainly used in functional programming.
- it has two parameters input and result we pass them as template class/ generic class.
- It represents a function which takes in one argument and produces a result.
  - T: denotes the type of the input argument
  - R: denotes the return type of the function

#### Command to make serverless request to Function interface annotated with @Bean

```
  curl -H "Content-Type: text/plain" localhost:8080/function -d "message"
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `message` | `string` | **Required** message is a string which is considered as a input for the Function Interface |

___

### 2. Consumer< T> interface
- It is also a functional interface introduced in java 8 which present in java.util package.
- It represents an operation that accepts a single input argument and returns no result.
- Unlike most other functional interfaces, Consumer is expected to operate via side-effects.



### 3. Supplier< T> interface
- It is also a functional interface introduced in java 8 which is present in java.util package.
- It represents a function which does not take in any argument but produces a value of type T.
- this functional interface takes in only one generic namely:-
  - T: denotes the type of the result

#### Command to make serverless request to Consumer interface annotated with @Bean

```
  curl -H "Content-Type: text/plain" localhost:8080/consume -d "message"
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `message` | `string` | **Required** message is a string which is considered as a input for the Consumer Interface |


___

#### Command to make serverless request to Supplier interface annotated with @Bean

```
  curl -H "Content-Type: text/plain" localhost:8080/supply
```

___

### Second way of creating a function Endpoint

- create a class and implement Function<T,R> interface.
- override the appky(R) method and write the logic inside.
- In the application.properties file write scan.package property.
  - spring.cloud.function.scan.packages:com.spring.cloudfunctions 
- In this scanario our endpoint will be class name.

#### command to make serverless request to Function interface with class Hello

```
  curl -H "Content-Type: text/plain" localhost:8080/hello -d "message"
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `message` | `string` | **Required** message is a string which is considered as a input for the Function Interface |




