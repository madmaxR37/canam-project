# Application de Dessin 2D

## Overview
Ceci est le code source d'une application desktop Java qui permet de dessiner des formes basiques en 2D. L'application a été développée en utilisant le design pattern MVC avec la programmation orientée objet (POO) en Java.

## Technologies Utilisées
- **Java**: Version 17.0.9
- **NetBeans**: Version 19 comme IDE
- **MySQL**: Version 8

## Problèmes Constatés
Malheureusement, toutes les fonctionnalités requises n'ont pas pu être complètement implémentées en raison d'une erreur de connexion entre l'application et la base de données MySQL. Ce problème est dû à l'objet JDBC qui ne se charge pas dans le projet, malgré mes nombreuses tentatives de configuration.

## Instructions d'Utilisation

### Prérequis
Assurez-vous d'avoir tous les prérequis nécessaires pour exécuter l'application.

### Étapes à Suivre
1. Exécutez l'application.
2. Remplissez les champs qui s'affichent avec des nombres (position (x,y), hauteur, largeur, et couleur), puis sélectionnez la forme et cliquez sur "Créer".
3. Réduisez la fenêtre (cliquez sur le bouton moins "-" en haut) et rouvrez-la.
4. Créez des formes à volonté.

*Note*: Cette étape est nécessaire en raison d'un bug que je n'ai pas réussi à corriger.

## Script de la Base de Données

Voici le script SQL pour créer la base de données et la table nécessaires :

```sql
CREATE DATABASE formdrawer2d;
USE formdrawer2d;

CREATE TABLE forme (
    id INT PRIMARY KEY,
    name VARCHAR(20),
    positionX INT,
    positionY INT,
    height INT,
    length INT,
    color VARCHAR(20)
);
