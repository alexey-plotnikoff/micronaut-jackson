Micronaut 4.3.4 with `micronaut-jackson-databind`.
`@JsonValue` works as expected.

Run application:
```
./gradlew run
```

and you will see:
```
body: {"courier":"ups-mi"}
```

Issue [#780](https://github.com/micronaut-projects/micronaut-serialization/issues/780).
