# Continuous Integration with Github Actions

![CI](https://github.com/enriquemolinari/static-analysis/actions/workflows/main.yml/badge.svg) [![][actions checkstyle img]][actions checkstyle] [![Maintainability](https://api.codeclimate.com/v1/badges/0f70b90190bf2b073c19/maintainability)](https://codeclimate.com/github/enriquemolinari/static-analysis/maintainability)

This is just to demosntrate a CI environment using Github Actions. We are running static analysis using maven, with several plugins:

- [Checkstyle](https://maven.apache.org/plugins/maven-checkstyle-plugin/examples/custom-checker-config.html). Using [Google style](https://google.github.io/styleguide/javaguide.html).
- [PMD](https://maven.apache.org/plugins/maven-pmd-plugin/). Using these [PMD Rules](https://pmd.github.io/latest/pmd_rules_java.html), except documentation.
- [Spotbugs](https://spotbugs.github.io/spotbugs-maven-plugin/). Using these [Spotbugs Rules](https://spotbugs.readthedocs.io/en/stable/bugDescriptions.html).

This repository is also using [Code Climate](https://codeclimate.com/), to rate the source code for their maintainability. The maintainability check tool will decrease the grade of your source code when find violations related to these:

- Argument count: Methods or functions defined with a high number of arguments
- Complex logic: Boolean logic that may be hard to understand
- File length: Excessive lines of code within a single file
- Identical blocks of code: Duplicate code which is syntactically identical (but may be formatted differently)
- Method complexity: Functions or methods that may be hard to understand
- Method count: Classes defined with a high number of functions or methods
- Method length: Excessive lines of code within a single function or method
- Nested control flow: Deeply nested control structures like if or case
- Return statements: Functions or methods with a high number of return statements
- Similar blocks of code: Duplicate code which is not identical but shares the same structure (e.g. variable names may differ)

To enable it in your project, you have to signin in code climate using your github accout and configure the repository you would like to be inspected by them.
