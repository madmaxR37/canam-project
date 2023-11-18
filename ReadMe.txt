Ceci est le code source d'une application desktop java qui permet de dessiner des formes basic en 2D.

Les outiles et technologie utiliser ici sont;
java version-17.0.9
netbeans 19 comme IDE
mysql version-8

Cette applicatin a ete faite en utilisant le designe patern MVC avec le java POO, toute les fonctionalite
requises n'ont malheuresement pas pu etre completement implementer comme requis, du a une erreur de connexion 
de l'application et de la base de donner mysql, ceci est arriver a cause de l'objet JDBC qui ne load pas dans leprojet
meme apres mes nombreuses tantatives de configuration.

Ceci m'a quand meme demander bcp d'heures de travail pour arriver a ce resultat donc j'aimerai que vous y jetter quand meme
un coups d'oeil.

une fois tout les pre-requis necessaire pour executer l'application, veuiller suivre ces etapes pour avoir une meilleur XP
-executer l'app
-remplir les cases qui s'affiche avec des nombre (position (x,y), hauteur, largeur, et couleur) en suite selectioner la 
forme et clicker sur cree
-reduire la feunetre(clicke sur le button moins "-" toute en haut) est la re-ouvrir
-fin, creer des forme a volonter.
Ceci est necessaire du a un bug que j'ai pas reussi a corriger.

Donc c'est tout merci d'y avoir jeter un coup d'oeil, ce projet etait super pour m'ameliorer!


Le scripte de la BD meme comme la connexion n'a pas ete etablite

create database formdrawer2d;
use formdrawer2d;
create table forme(
id int primary key,
name varchar(20),
possitionX int,
positionY int,
hight int,
length int,
color varchar(20)
);
