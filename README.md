# Práctica Mastermind
Juego de Mastermind con interfaz de consola y con casos de uso: arrancar, jugar y continuar
## Modelo del dominio
### Vocabulario 📋
![UML](http://www.plantuml.com/plantuml/png/POzFQ_Cm38Vl-XGcnnSItXPs6wEqOzsbB7I3iQEQYDRKiOh_K0hxy8lj1ZlRHRKUFVr5Mbc7nlb1WPDEaTYXTMHsKlUY5iyIZmO7W4wXjSKCeF3-rVMJ-F16_u5hHZEwOPP0jQn4g_161Y3zYiVlkXQlVa0z8niUBju5Rtg94F1EdI6N6GVuGjGVi3j3Z8bUQ_Z2blg4ahPbL4LSqnHQc4MoGzUTedMG6fradVR97vxnd03nsFkPYshwGw8SwV-cMImhiUShm5YoEuL4cjqgNmRJAuyVglkoiOPbKj-obM6_ttp3YityihJ069HciQQpFa_IKGdMoi_wFVLbsqfzBlkj8T8b-2Ab-3fNy5RsRmRraM15klU3-W40)
_Código de PlantUML_

```
@startuml
title MasterMind - Diagram

class MasterMind

MasterMind *--> Turn
MasterMind *--> Board

Turn *--> "2" Player

Player <|-- Human
Player <|-- Computer

Computer --> Secret
Computer o--> Feedback
Human --> Proposed
Human o--> Goal

Computer ..> Proposed
Goal ..> Match

Combination <|-- Secret
Combination <|-- Proposed

Board *--> "1" Secret
Board o--> "0..12" Row

Row *--> "1" Proposed
Row o--> "0..1" Feedback

Feedback o--> "0..5" Match
Match<|-- MatchPosition
Match<|-- MatchColor

Combination *--> "5" Color
Color <|-- White
Color <|-- Blue
Color <|-- Red
Color <|-- Pink
Color <|-- Green
Color <|-- Yellow
Color <|-- Gray
Color <|-- Orange
@enduml
```
## Herramientas 🛠️

_Enlace al proyecto PlantUML_

* [Proyecto Mastermind - PlantUML](http://www.plantuml.com/plantuml/uml/POzFQ_Cm38Vl-XGcnnSItXPs6wEqOzsbB7I3iQEQYDRKiOh_K0hxy8lj1ZlRHRKUFVr5Mbc7nlb1WPDEaTYXTMHsKlUY5iyIZmO7W4wXjSKCeF3-rVMJ-F16_u5hHZEwOPP0jQn4g_161Y3zYiVlkXQlVa0z8niUBju5Rtg94F1EdI6N6GVuGjGVi3j3Z8bUQ_Z2blg4ahPbL4LSqnHQc4MoGzUTedMG6fradVR97vxnd03nsFkPYshwGw8SwV-cMImhiUShm5YoEuL4cjqgNmRJAuyVglkoiOPbKj-obM6_ttp3YityihJ069HciQQpFa_IKGdMoi_wFVLbsqfzBlkj8T8b-2Ab-3fNy5RsRmRraM15klU3-W40) - Proyecto
* [PlantUML](https://plantuml.com/)
