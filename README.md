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




## Estilo Arquitectónico Modelo/Vista/Presentador con Presentador del Modelo
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 25%;">
<col style="width: 75%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Participante</th>
<th class="tableblock halign-left valign-top">Responsabilidad</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><div class="content"><div class="paragraph">
<p><strong class="blue">Modelo</strong></p>
</div></div></td>
<td class="tableblock halign-left valign-top"><div class="content"><div class="paragraph">
<p>manejar los <strong class="blue">datos</strong> y la funcionalidad del <strong class="blue">negocio</strong></p>
</div></div></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><div class="content"><div class="paragraph">
<p><strong class="blue">Vista</strong></p>
</div></div></td>
<td class="tableblock halign-left valign-top"><div class="content"><div class="paragraph">
<p>manejar los controles de interfaz y <strong class="blue">eliminando el estado, lógica y sincronización de la presentación</strong>: <strong class="blue">Vista Pasiva</strong></p>
</div></div></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><div class="content"><div class="paragraph">
<p><strong class="blue">Presentador</strong></p>
</div></div></td>
<td class="tableblock halign-left valign-top"><div class="content"><div class="paragraph">
<p>manejar <strong class="blue">la totalidad del estado y lógica de la presentación</strong></p>
</div></div></td>
</tr>
</tbody>
</table>

## Composite
### 
* **Intención:**
  * La intención de este patrón es componer objetos en estructuras arbóreas para representar las jerarquías de todo-parte y permitir a los clientes tratar con objetos individuales y objetos compuestos uniformemente.
* **Aplicabilidad:**
  *  Representar jerarquías de objetos parte-todo.
  *  Permitir que los clientes sean capaces de obviar las diferencias entre composiciones de objetos y los objetos individuales. Los clientes tratarán a todos los objetos de la estructura compuesta de manera uniforme.

## Enunciado
mvp.pm.withComposite, con:
* el diseño de clases, con plantuml en readme o con StarUML con el documento  
* solución en Java o similar (fuertemente tipado) basada en el capitulo de Patrones de Diseño y Arquitectura y el proyecto ticTacToe
  *  Modelo del Dominio: https://github.com/USantaTecla-ticTacToe/tictactoe.requirements
  *  Requisitos: https://github.com/USantaTecla-ticTacToe/tictactoe.requirements/tree/3.UndoRedo
  *  Diseño: https://github.com/USantaTecla-ticTacToe/tictactoe/tree/mvp.pm.withComposite/docs
  *  Implementación:  https://github.com/USantaTecla-ticTacToe/tictactoe/tree/mvp.pm.withComposite/src


## Author

👤 **Enrique Casas Fernández**

* Github: [@EnriqueCF](https://github.com/EnriqueCF)


Note that you should have to [install JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and [Maven](https://maven.apache.org/install.html) as prerequisite.
