# spring-cloud-functions

This is an application to run spring cloud functions locally on system

## API Reference

### Function<T,R> functional Interface
- it is a functional interface present in the java.util package.
- it is introduced in java 8.
- it is mainly used in functional programming.
- it has two parameters input and result we pass them as template class/ generic class.
- We use Function interface when we have a situation where we need to give some input and get some output in return.

#### Command to make serverless request to Function interface annotated with @Bean

```
  curl -H "Content-Type: text/plain" localhost:8080/function -d "message"
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `message` | `string` | **Required** message is a string which is considered as a input for the Function Interface |



#### Command to make serverless request to Consumer interface annotated with @Bean

```
  curl -H "Content-Type: text/plain" localhost:8080/consume -d "message"
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `message` | `string` | **Required** message is a string which is considered as a input for the Consumer Interface |



#### Command to make serverless request to Supplier interface annotated with @Bean

```
  curl -H "Content-Type: text/plain" localhost:8080/supply
```



