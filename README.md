# Serenity and Cucumber

A very stripped back serenity setup - looking to see the absolute minimum required.

1 test intentionally failing to prove that the report is still generated.

Tests tagged with `@a` and `@b` to test filtering using the command line:
```sh
mvn clean verify -Dcucumber.filter.tags=<tags>
```

Tags can be combined i.e. `@a and @b`, `@a or @b`