# API Springboot

## Introduction

Ce projet est une API Spring Boot utilisant les dépendances suivantes:

- **Spring Web**<br>Fourni des annotations et classes pour la création de controleurs REST, la gestion des requêtes HTTP, ...
- **Spring Data JPA**<br>Réduit le code boilerplate nécessaire pour interagir avec la couche de persistance des données.
- **H2 Database**<br>DB relationnelle en mémoire très légère et rapide.
- **Lombok**<br>Réduit le code boilerplate en générant automatiquement les getters, setters, constructeurs, etc

---

## Endpoints

- `GET /users`<br>Retourne la liste des utilisateurs en base de données

---

## Exercice

Votre tâche consiste à écrire les tests unitaires du service `UserService`.

Les dépendances suivantes sont à votre disposition: `JUnit`, `Mockito`, `Hamcrest`.
