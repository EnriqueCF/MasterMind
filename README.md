<h1 align="center">Welcome to Mastermind. Versión 9.3. ** mvp.pm.withComposite ** 👋</h1>
<p>
  <a href="/docs" target="_blank">
    <img alt="Documentation" src="https://img.shields.io/badge/documentation-yes-brightgreen.svg" />
  </a>
  <a href="#" target="_blank">
    <img alt="License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
  </a>
</p>

> Mastermind. Solución mvp.pm.withComposite

## Install

```sh
mvn install
```

## Usage

```sh
mvn clean
mvn package
java -jar target/tictactoe-1.0-SNAPSHOT.jar
```

## Run tests

```sh
mvn test
```

## Composite
### 
* **Intención:**
  * La intención de este patrón es componer objetos en estructuras arbóreas para representar las jerarquías de todo-parte y permitir a los clientes tratar con objetos individuales y objetos compuestos uniformemente.
* **Aplicabilidad:**
  *  Representar jerarquías de objetos parte-todo.
  *  Permitir que los clientes sean capaces de obviar las diferencias entre composiciones de objetos y los objetos individuales. Los clientes tratarán a todos los objetos de la estructura compuesta de manera uniforme.


## Author

👤 **Enrique Casas Fernández**

* Github: [@EnriqueCF](https://github.com/EnriqueCF)


Note that you should have to [install JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and [Maven](https://maven.apache.org/install.html) as prerequisite.
