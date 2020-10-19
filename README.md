# Práctica Mastermind
Juego de Mastermind con interfaz de consola y con casos de uso: arrancar, jugar y continuar
## Modelo del dominio
### UML 📋
![UML](/uml.png)
_Código de PlantUML_

```
@startuml
class urjc.master.dcs.mastermind.util.Console {

	+ {static} Console console;
	+ {static} Console instance()
	- BufferedReader bufferedReader
	+ String readString(String)
	+ String readString()
	+ int readInt(String)
	+ char readChar(String)
	+ void writeln()
	+ void write(String) 
	+ void write(int)
	+ void writeln(String)
	+ void writeln(int)
	+ void write(char)
	+ void writeError(String)
}

class urjc.master.dcs.mastermind.util.YesNoDialog {

	- {static} final char AFFIRMATIVE
	- {static} final char NEGATIVE
	- {static} final String SUFFIX
	- {static} final String MESSAGE 
	- char answer;
	+ boolean read(String)
	- boolean isAfirmative()
	- char getAnswer()
	- boolean isNegative()

}


class urjc.master.dcs.mastermind.MasterMind {
    - Board board
    - Turn turn

    - void play()
    - void playGame()
    - boolean isFinished()
    + {static} void main(String[] args)
}

class urjc.master.dcs.mastermind.Board {
    - final int MAX_ROWS
    - Row[] results
    - int attempts
    - Secret secret

    + Board()
    + void add(Proposed proposed)
    + void add(Feedback feedback)
    + void addSecret(Secret secret)
    + boolean isCompleted()
    + boolean hasWinner()
    + Proposed getActualProposedCombination()
    + void write()
    + void writeWinner()
}

class urjc.master.dcs.mastermind.Turn {
    - {static} final int NUMBER_PLAYERS
    - Player[] players
    + Turn(Board board)
    + play(Board board)
}

class urjc.master.dcs.mastermind.Row {
    - Proposed proposedCombination
    - Feedback feedback
    + Row()
}

class urjc.master.dcs.mastermind.Feedback {
    - List<Match> matchs
    - static final int MAX_SIZE
	- int blacks
    - int whites

    + Feedback()
	+ Feedback(Proposed proposed, Secret secret)
	- void initialize()
	+ boolean hasWinner()
	+ void writeln()
}

abstract class urjc.master.dcs.mastermind.Player {
    + abstract void play(Board board)
}

class urjc.master.dcs.mastermind.User extends urjc.master.dcs.mastermind.Player{
    - Proposed proposed
    + void play(Board board)
}

class urjc.master.dcs.mastermind.Machine extends urjc.master.dcs.mastermind.Player{
    - Secret secret
    + void play(Board board)
}

abstract class urjc.master.dcs.mastermind.Combination {
    + {static} final int MAX_SIZE
    - List<Color> colors;

    + Combination()
}
class urjc.master.dcs.mastermind.Secret extends urjc.master.dcs.mastermind.Combination {
	+ Secret() 
	+ void writeln()
}
  
class urjc.master.dcs.mastermind.Proposed extends urjc.master.dcs.mastermind.Combination{
	void write()
	void read() 
	- Error checkError(String)
	- boolean contains(Color, int) 
	- boolean contains(Color) 
}
enum urjc.master.dcs.mastermind.Match {
	SAME_COLOR
	SAME_POSITION
	NULL_Match

	+ boolean isNull()
}
enum urjc.master.dcs.mastermind.Color {
	RED
	BLUE
	YELLOW
	GREEN
	PINK
    WHITE
	NULL_COLOR

	- char symbol

	Color(char symbol)

}

enum urjc.master.dcs.mastermind.Error {
	WRONG_CHARACTERS
	WRONG_LENGTH
	NULL_ERROR

	- String message;

	Error()
	Error(String message)

	void writeln()
}

enum urjc.master.dcs.mastermind.Message {
    ATTEMPTS
    SECRET
    RESUME
    RESULT
    PROPOSED_COMBINATION
    TITLE
    WINNER
    LOOSER
    BYE
    NULL_MESSAGE

    - String message;

    Message()
    Message(String message)

    void write()
    void writeln()
}

class urjc.master.dcs.mastermind.util.Console
class urjc.master.dcs.mastermind.util.YesNoDialog

urjc.master.dcs.mastermind.MasterMind *--> urjc.master.dcs.mastermind.Board
urjc.master.dcs.mastermind.MasterMind *--> urjc.master.dcs.mastermind.Turn
urjc.master.dcs.mastermind.MasterMind ...> urjc.master.dcs.mastermind.util.YesNoDialog

urjc.master.dcs.mastermind.Board *--> "10" urjc.master.dcs.mastermind.Row
urjc.master.dcs.mastermind.Board *--> urjc.master.dcs.mastermind.Secret
urjc.master.dcs.mastermind.Board ...> urjc.master.dcs.mastermind.util.Console
urjc.master.dcs.mastermind.Board ...> urjc.master.dcs.mastermind.Message

urjc.master.dcs.mastermind.User *--> urjc.master.dcs.mastermind.Proposed
urjc.master.dcs.mastermind.Machine *--> urjc.master.dcs.mastermind.Secret

urjc.master.dcs.mastermind.Turn *--> "2" urjc.master.dcs.mastermind.Player
urjc.master.dcs.mastermind.Turn ...> urjc.master.dcs.mastermind.Message
urjc.master.dcs.mastermind.Turn ...> urjc.master.dcs.mastermind.Board

urjc.master.dcs.mastermind.Row *--> "1" urjc.master.dcs.mastermind.Proposed
urjc.master.dcs.mastermind.Row *--> "1" urjc.master.dcs.mastermind.Feedback
urjc.master.dcs.mastermind.Feedback*--> "1" urjc.master.dcs.mastermind.Match
urjc.master.dcs.mastermind.Row ...> urjc.master.dcs.mastermind.util.Console

urjc.master.dcs.mastermind.Combination ...> urjc.master.dcs.mastermind.util.Console
urjc.master.dcs.mastermind.Combination ...> urjc.master.dcs.mastermind.Color
urjc.master.dcs.mastermind.Combination ...> urjc.master.dcs.mastermind.Error
urjc.master.dcs.mastermind.Combination *-down-> "5" urjc.master.dcs.mastermind.Color : colors
@enduml
```
## Herramientas 🛠️

_Enlace al proyecto PlantUML_

* [Proyecto Mastermind - PlantUML](http://www.plantuml.com/plantuml/uml/f5PXSwCs4_viVeK-udal-GDvvwR4KHocW3s0wqixdOmCYgqUY8maNthDvBztlP8SOkBQr-P3M1wjTX_sUP3vIHkcpBPjWgfXMfEj-gEwR9asN5tMbNPXAsHzkJMYkPnqKdSD9oz1CFeVUO7THbIlnCELlLvzk2Wa8BBYuJWONP3hxUCZLxpEEQkv8gjtjxlzXL52hea2m8QXlOm_NaHOI8DOB4q_kzemXVW4Wlx2jqxKv5a9mniP7Y0-Znp0q6EmzsZDONAu8tE0KQMwDrwlmPbYt7ETTJU2DTqQ1Rbuc_cZaAonpntTtiPv6fNnB_HOIaQdnzRTe8i5LFboV3sbHH5DAO4CMv99_SmL6c7LWVfCeW1lWxhOuq97ZqArKFKRUiDLM7CJOP7m83lZQvyBipfZM2c6AOGm9W9_uBwEgHfgmd-7b5ibYO5_WGDGdgU6VOS-1yYKjToXVMAtGWgzuRLRwhq2kBDbmXlbjzy9KsjzdjQMgsUEOqUZfz6NXtosBDn2tZr3MSNrjZ7QOfZ6ZE7jqnugUAMu8HelWIEABJnjovRLTJXNtLEdEJoq2mOPjvpNArPz9OykEComxS9tNLrERtAJhdrgk76Zwwzjc5uAARdQhtXIQ93AR5dZ4QYoWkaOqKcVtN_nXf2hV9uCQ12lWbUs9qUsIAzf_Z1FedkQUr7cu1QkG9Sd3BIZiAiLzZpeg65M7p-F6IY_9pQGh3SKbpBGp3M7CcUEOb_1Tqs4DlzFcQasdqcxktYtsJ4TcBQ8VyMZPdU_Qg1EtwxF6n16UsFwJlPmzdT3OtuY1muRkTTLI644QyHVt9OO-cfuQECGs4eRnIf3Jax3QanU76M_4Ml-IqKN6WhoFmsNzHcjZshl6Fq78YchDaBo7-RoNewJFCuVTi_EvENmc1tQhE_FITTqwZEfTXTzvHtMAuZ2dsJWdinDv7oku39t68x9XvOZv7HpB_4FjeVk_OFGtk4FCfAv8FW5GgeDhxvY-D7lTDL9muJK8GxoqsxEOt8y0TPU0owtxJznn3DZDvmYIkd3P9RCSXVFPqLSnhCi66MB97d0HFpex7q8R9ic79_H1VdikkJq9XXT9miuVkvfaioMmMYQKmfDvd7sCpfYUHUNr3PrVFPV9Ffxk-eQkCTwOG_3Bv6JDEoGWSOodsNJXybTb4UJakQ5HnAQJSixrvpckMjkjI0jrvgj-HLWLgEn3zudZ25XOAxJIjZDxgMAofAcyxB0cu9ESbfYcDDYaT9zc5Xqdiz0Bde30qkluopQwOOBPLmcDdiPPndDCKnca6l3wtkxQYN-k_9onq4O1e9eFyTm6SaM8D5GH1o6aa-5k3vOJEVYpPRvwCcxNcTU_Wvf_rghdhUzIcUvhzRwvyCb-TUUbFvvwb8kPLAwzRwZ01POP34XQeonryg56howTZmqq9cGX5zfuhZ8S0926Xyo2RBVvN4EYBCxRPLWQhnvfyOIGAYqJn67Jux0dJsLhT9mPh4-AtY7UGvHM5Xjq9LfHGbQOMAOLs0GoJbiwxVNvpdtuznODousJLr_elP-tBy0) - Proyecto
* [PlantUML](https://plantuml.com/)
