# To-Do List API (Spring Boot)

A simple, lightweight REST API to manage to-do tasks—built using **Java**, **Spring Boot**, and an in-memory **H2 database**. This project is part of a hands-on learning journey to rebuild engineering leadership with modern tech stacks.

---

##  Features

-  Create new to-do tasks
-  Retrieve all tasks
-  Update existing tasks (edit, mark completed)
-  Delete tasks
-  Built with clean code principles & REST best practices

---

## Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database**
- **Maven**

---

##  API Endpoints

| Method | Endpoint         | Description            |
|--------|------------------|------------------------|
| GET    | `/api/todos`     | Get all to-dos         |
| POST   | `/api/todos`     | Create a new to-do     |
| PUT    | `/api/todos/{id}`| Update an existing to-do |
| DELETE | `/api/todos/{id}`| Delete a to-do         |

###  Sample JSON (Request Body)

```json
{
  "task": "Write Spring Boot To-Do API",
  "completed": false
}


Perfect! Here’s a clean and professional README.md for your To-Do List API (Spring Boot) project, tailored for showcasing on your GitHub profile:

⸻



# 📝 To-Do List API (Spring Boot)

A simple, lightweight REST API to manage to-do tasks—built using **Java**, **Spring Boot**, and an in-memory **H2 database**. This project is part of a hands-on learning journey to rebuild engineering leadership with modern tech stacks.

---

## 🚀 Features

- ✅ Create new to-do tasks
- 🗂️ Retrieve all tasks
- ✏️ Update existing tasks (edit, mark completed)
- ❌ Delete tasks
- 💡 Built with clean code principles & REST best practices

---

## 🧰 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database**
- **Maven**

---

## 📦 API Endpoints

| Method | Endpoint         | Description            |
|--------|------------------|------------------------|
| GET    | `/api/todos`     | Get all to-dos         |
| POST   | `/api/todos`     | Create a new to-do     |
| PUT    | `/api/todos/{id}`| Update an existing to-do |
| DELETE | `/api/todos/{id}`| Delete a to-do         |

### ✅ Sample JSON (Request Body)

```json
{
  "task": "Write Spring Boot To-Do API",
  "completed": false

🛠️ How to Run Locally
	1.	Clone the repository:

git clone https://github.com/swarna73/todo-api-springboot.git
cd todo-api-springboot

	2.	Run the application:

./mvnw spring-boot:run

	3.	Access the API at:

http://localhost:8080/api/todos



⸻

🎯 Future Enhancements
	•	Add user authentication (JWT)
	•	Connect to a real database (e.g., PostgreSQL)
	•	Add Swagger UI for API docs
	•	Dockerize the app

⸻

📚 Learning Purpose

This project is the first step in rebuilding a strong hands-on portfolio as part of a career transformation into modern Engineering Manager roles.

⸻

📄 License

This project is licensed under the MIT License.

⸻



---

### ✅ To Use It:
1. Copy the entire text above.
2. Create a file called `README.md` in your project root (if not already).
3. Paste and save.
4. Commit and push:

```bash
git add README.md
git commit -m "Added project README"
git push origin main

Let me know when you’re ready to move on to the next project, or if you want help adding Swagger, Docker, or authentication to this one! 🚀
