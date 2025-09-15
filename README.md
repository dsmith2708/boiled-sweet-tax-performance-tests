# boiled-sweet-tax-registration-performance-tests

Performance test suite for the `Boiled Sweet Tax Registration Service`, using [performance-test-runner](https://github.com/hmrc/performance-test-runner) under the hood.


## Pre-requisites

### Services
Start the BST frontend and backend services using the sbt commands in their respective readmes

### Logging

The default log level for all HTTP requests is set to `WARN`. Configure [logback.xml](src/test/resources/logback.xml) to update this if required.

## Tests

Run smoke test (locally) as follows:

```bash
sbt -Dperftest.runSmokeTest=true -DrunLocal=true Gatling/test
```

Run full performance test (locally) as follows:

```bash
sbt -DrunLocal=true gatling:test
```



## License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
