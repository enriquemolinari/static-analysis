# Continuous Integration with Github Actions

![Checkstyle](https://github.com/enriquemolinari/static-analysis/actions/workflows/checkstyle.yml/badge.svg) ![PMD](https://github.com/enriquemolinari/static-analysis/actions/workflows/pmd.yml/badge.svg) ![Spotbugs](https://github.com/enriquemolinari/static-analysis/actions/workflows/spotbugs.yml/badge.svg) [![codecov](https://codecov.io/gh/enriquemolinari/static-analysis/branch/main/graph/badge.svg?token=K8NLEOA3WN)](https://codecov.io/gh/enriquemolinari/static-analysis) [![Maintainability](https://api.codeclimate.com/v1/badges/0f70b90190bf2b073c19/maintainability)](https://codeclimate.com/github/enriquemolinari/static-analysis/maintainability)

![continuous-integration](https://user-images.githubusercontent.com/11150895/198878926-a99ff6f8-9de7-4788-ba41-cceb89cd1928.png)

En este repositorio simplemente demostramos como utilizar Github actions para incorporar integración continua a nuestro proyecto. Utilizando maven, corremos test de JUnit y análisis estático:

- [Checkstyle](https://maven.apache.org/plugins/maven-checkstyle-plugin/examples/custom-checker-config.html). Utilizamos la guía de estilos de [Google](https://google.github.io/styleguide/javaguide.html).
- [PMD](https://maven.apache.org/plugins/maven-pmd-plugin/). Utilizamos las siguientes reglas [PMD Rules](https://pmd.github.io/latest/pmd_rules_java.html), excepto las relacionadas con la documentation (javadoc).
- [Spotbugs](https://spotbugs.github.io/spotbugs-maven-plugin/). Éstas son las reglas que spotbugs verifica: [Spotbugs Rules](https://spotbugs.readthedocs.io/en/stable/bugDescriptions.html).

También utilizamos el plugin de maven [Jacoco](https://www.eclemma.org/jacoco/trunk/doc/maven.html) para generar reportes de covertura de código. Luego, enviamos los reportes mediante una acción de Github a [Codecov](https://about.codecov.io/), para mostrar el badge con el porcentaje de covertura.

Ademas, utilizamos [Code Climate](https://codeclimate.com/), otro analizador de código estático que ranquea nuestros fuentes segun las siguientes métricas:

- Argument count: Methods or functions defined with a high number of arguments
- Complex logic: Boolean logic that may be hard to understand
- File length: Excessive lines of code within a single file
- Identical blocks of code: Duplicate code which is syntactically identical (but may be formatted differently). PMD posee CPD (Copy Paste Detector), pero no existe aun un plugin que muestre los resultados en github actions.
- Method complexity: Functions or methods that may be hard to understand
- Method count: Classes defined with a high number of functions or methods
- Method length: Excessive lines of code within a single function or method
- Nested control flow: Deeply nested control structures like if or case
- Return statements: Functions or methods with a high number of return statements
- Similar blocks of code: Duplicate code which is not identical but shares the same structure (e.g. variable names may differ)

Para habilitar en cualquier proyecto de Github code climate y codecov hay que registrarse utilizando la cuenta de github.
