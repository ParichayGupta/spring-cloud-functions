# spring-cloud-functions

This is an application to run spring cloud functions locally on system

## API Reference

#### Command to make serverless request to Function interface annotated with @Bean

```
  curl -H "Content-Type: text/plain" localhost:8080/function -d "message"
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `message` | `string` | **Required** message is a string which is considered as a input for the Function Interface |


