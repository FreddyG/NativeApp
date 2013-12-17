Classes
=============

MainActivity:
-------------
<ul>
<li>provides buttons to go to gameplay,settings,highscores or exits</li>
</ul>


GameplayActivity:
-------------
<ul>
<li>makes in-game objects</li>
<li>handels game</li>
<li>stores highscores</li>
<li>make gameplay objects(draw them)</li>
<li>update game current status (on screen)</li>
<li>handels input and update the model</li>
<li>takes care of all sounds in game</li>
</ul>
SettingsActivity:
-------------
<ul>
<li>displays settings</li>
<li>save settings (SharedPreferences)</li>
</ul>
HighscoresActivity:
-------------
<ul>
<li>displays highscores, using data from mysqlite database</li>
</ul>



Class ship:
-------------
Methodes:
<ul>
<li>boolean move(String direction, int units)</li>
<li>void shoot(Bullet typeOfBullet)</li>
<li>boolean hasCollide(GameObjetc o)</li>
In hasCollide implement damage.
</ul>
Fields:
<ul>
<li>lives</li>
<li>position</li>
<li>ammo</li>
<li>bullet</li>
</ul>
Class EnemyShip extends ship:
-------------
Added Methodes:
<ul>
<li>add specific abilities</li>
</ul>
Added Fields:
<ul>
<li>Ammo will be infinite.</li>
<li>String possibleDirections []</li>
<li>Specify type of bullet</li>
</ul>


Class MyShip extends ship:
-------------
Added methodes:
<ul>
<li>void pressedLeft()</li>
<li>void pressedRight()</li>
<li>void pressedFire()</li>
</ul>

<ul>
Added Fields:
<li>lives (depending on settings)</li>
<li>Bullet myBullet</li>
</ul>
Class GameObject:
-------------

Methods:
<ul>
<li>void move(String direction,int units)</li>
<li>void collision(Object o)</li>
</ul>
Fields
<ul>
<li>position</li>
</ul>


Class PowerUp extends GameObject:
-------------
Added Methods:
<ul>
</li>void powerUp(String fieldToChange,String value)</li>
</ul>

Added Fields:
<ul>
<li>Move will be falling</li>
</ul>

Class Bullet extends GameObject:
-------------

Added Methods:
<ul>
</li>void collision(Object o)</li>
</ul>

Added Fields:
<ul>
<li>Move will be falling</li>
</ul>

Class SaveScore:
-------------
Saves score
Class MakeDb: 
-------------
Creates database

Class Data:
-------------
Fields:
<ul>
<li>Username</li>
<li>Score</li>
<li>Difficulty</li>
<li>Lives</li>
</ul>


Databases:
=============

Highscores-database:
-------------
Fields:
<ul>
<li>Username</li>
<li>Score</li>
<li>Difficulty</li>
<li>Lives</li>
</ul>

Java style:
=============
<ul>
<li>Variables: someVariable</li>
<li>Classes: SomeClass</li>
<li>Methodes: someMethod</li>
<li>Activity: SomeActivity</li>

</ul>
<ul>
Comments:
<li> //comment max 1 line </li>
<li>/** multiple</li>
<li>lines */</li>
</ul>

Tutorials:

http://www.edu4java.com/en/androidgame/androidgame4.html
