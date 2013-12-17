Classes
=============

MainActivity:
provides buttons to go to gameplay,settings,highscores or exits

GameplayActivity:
makes in-game objects
handels game
stores highscores
make gameplay objects(draw them)
update game current status (on screen)
handels input and update the model
takes care of all sounds in game

Settingscontroller:
displays settings
save settings (SharedPreferences)

HighscoresActivity:
displays highscores, using datafrom mysqlite database


Here are some in-game classes I would like to implement.
Class <name>:
<method>

Class ship:
boolean move(String direction, int units)
void shoot
boolean hasCollide(GameObjetc o)
Fields:
-energy
-position
-ammo

Class EnemyShip extends ship:
add specific movements
add specific shots
add specific abilities

Class MyShip extends ship:
override movements
override shoot

Class GameObject:
movement
collision

Class power_up extends game_object:
add specific power_up
Class beams extends game_object:
override  values 

Class bullets extends game_object:
override  values 
****(Simplify as much as possible)

Databases:

Highscores-database:
user
score
level (***Implement for second phase)
lives (if reached end)


Styles:

Java-code:



Tutorials:

http://www.edu4java.com/en/androidgame/androidgame4.html
