# RockPaperScissors
A rock, paper, scissors game.

## The Game
"Rock Paper Scissors" is a game where two participants each choose to display (usually with simultaneous hand motions) "rock" or "paper" or "scissors".   


### Winning Conditions
The winner is chosen on the basis of what each participant chooses to display.
- "Rock" looses to "Paper"
- "Paper" looses to "Scissors"
- "Scissors" looses to "Rock"    


Both participants displaying the same sign results in a draw.  

## Program Objectives
This text-based game was created for a single, first-player perspective. 

The player can either choose to play against a computer or play against another human. (Since the other human will be using the same computer, this mode is only recommended for learning the rules of the game.)

### MVP Requirements
#### Features
| Objective                                                                                 | Comment                                                                                                 |
|-------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------|
| Have a main menu with options for either a 2 player game or to play against the computer. | Implemented.                                                                                            |
| When the game is over, the winner should be declared.                                     | Following the example we were given, the outcome is declared using the perspective of the first player. |

#### Technical
| Objective                                                                           | Comment                                                           |
|-------------------------------------------------------------------------------------|-------------------------------------------------------------------|
| Use classes to remove repetitive parts of the code.                                 | Implemented                                                       |
| Create an abstract player class to manage the state of the player.                  | Implemented. The outcome is recorded by each participating class. |
| Handle incorrect capitalization of otherwise valid input.                           | Implemented                                                       |
| Each class should have methods associated with it and be instantiated as an object. | Implemented                                                       | 
| Get standard input using a ```Scanner```                                            | Implemented                                                       |
| Use arrays or array lists to store game history.                                    | All history is stored in an array list                            |

### Bonus/Gold Options
| Description                                                                      | Comment                                                                                                                                           |
|----------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|
| Automated JUnit tests.                                                           |                                                                                                                                                   |
| Use an Agile project management framework.                                       | An agile framework was used - more or less. I used an iterative design and coding process rather than a complete design before the project began. |
| Use packages to modularize code.                                                 | I used a total of seven files in the project                                                                                                      |
| Use generics on collections to store different data composed of different types. |                                                                                                                                                   |
| Use multithreading to handle concurrent requests.                                |                                                                                                                                                   |
| Incorporate video, text, data, networking, and sound using ```Processing```      |                                                                                                                                                   |

## Technologies Used
- Java 11 was the only language used in this project.

## Getting Started
Either:   
Clone the repository to a local computer then open up an IDE (such as IntelliJ IDEA) and run the Main method class in the RockPaperScissors package.<br>   

Or:   
Run the file: `jar/RockPaperScissors.jar`