
# Student Management System API

Ce projet est une API REST simple développée avec **Spring Boot**, qui permet de gérer des dossiers d'étudiants : ajouter, récupérer, mettre à jour et supprimer.

## ✨ Fonctionnalités

- Ajouter un étudiant
- Récupérer la liste de tous les étudiants
- Récupérer un étudiant par son ID
- Mettre à jour les informations d'un étudiant
- Supprimer un étudiant
- Base de données en mémoire **H2** pour le stockage temporaire
- Console H2 activée pour explorer la base de données
- Validation des données (optionnel)

## 🛠️ Technologies utilisées

- Java 17+ (ou 11+)
- Spring Boot 3.0+
- Spring Web
- Spring Data JPA
- Base de données H2
- Maven
- Postman (pour tester l'API)

## ⚙️ Installation et Lancement

1. **Cloner le projet**

```bash
git clone https://github.com/ton-nom-utilisateur/student-api.git
cd student-api
```

2. **Ouvrir dans ton IDE préféré** (IntelliJ IDEA, Eclipse, VS Code)

3. **Lancer le projet**

- Depuis ton IDE → Lancer `StudentApiApplication.java`
- Ou avec Maven :

```bash
./mvnw spring-boot:run
```

4. **Accéder à l'application**

- API disponible à : `http://localhost:8080/api/students`
- Console H2 disponible à : `http://localhost:8080/h2-console`  
  (JDBC URL: `jdbc:h2:mem:studentdb`)

## 📚 API Endpoints

| Méthode | URL                     | Description                  |
|:--------|:------------------------|:------------------------------|
| POST    | `/api/students`          | Ajouter un nouvel étudiant    |
| GET     | `/api/students`          | Récupérer tous les étudiants  |
| GET     | `/api/students/{id}`      | Récupérer un étudiant par ID  |
| PUT     | `/api/students/{id}`      | Mettre à jour un étudiant     |
| DELETE  | `/api/students/{id}`      | Supprimer un étudiant         |

## 📑 Exemple de requêtes (JSON)

### Ajouter un étudiant (POST)

```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "major": "Computer Science"
}
```

### Réponse d'une récupération (GET)

```json
[
  {
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "major": "Computer Science"
  }
]
```

## ✅ Validation des Données (optionnelle)

> Ajoute des annotations comme `@NotBlank`, `@Email`, etc. dans l'entité `Student` pour garantir la validité des données entrantes.

## 🧹 Améliorations possibles

- Ajouter la pagination et le tri pour la liste des étudiants
- Implémenter des tests unitaires et d'intégration
- Ajouter un système d'authentification (ex: JWT)
- Déployer sur une plateforme cloud (Heroku, Render...)

## 📄 Licence

Projet open-source utilisé pour l'apprentissage. Tu peux l'utiliser, le modifier ou l'améliorer librement.
