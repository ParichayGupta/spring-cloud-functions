# spring-cloud-functions

This is an application to run spring cloud functions locally on system

## API Reference

### - Function<T,R> Interface

- it is a functional interface present in the java.util package.
- it is introduced in java 8.
- it is mainly used in functional programming.
- it has two parameters input and result we pass them as template class/ generic class.
- It represents a function which takes in one argument and produces a result.

#### Command to make serverless request to Function interface annotated with @Bean

```
  curl -H "Content-Type: text/plain" localhost:8080/function -d "message"
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `message` | `string` | **Required** message is a string which is considered as a input for the Function Interface |

___

### - Consumer< T> interface
- It is also a functional interface introduced in java 8 present in java.util package.
- It represents an operation that accepts a single input argument and returns no result.
- Unlike most other functional interfaces, Consumer is expected to operate via side-effects.



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



