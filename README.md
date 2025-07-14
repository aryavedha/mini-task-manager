# mini-task-manager
mini-task-manager

#  Mini Task Manager

A simple Java web application to **add** and **view tasks** using Servlets, built with **Java 17**, **Maven**, and styled using **Bootstrap 5**.

---

##  Features

-  Add a task via a simple web form  
-  View a list of added tasks (in-memory)  
-  Clean, responsive Bootstrap UI  
-  Deployable on Tomcat or run via Jetty plugin

---

##  Tech Stack

- **Java 17**
- **Jakarta Servlet API 5.0**
- **Apache Maven**
- **Tomcat 10+** or **Jetty** (for embedded server)
- **Bootstrap 5** (CDN)

---

##  Project Structure

mini-task-manager/
- ├── pom.xml
- └── src/
- └── main/
- ├── java/com/example/
- │ ├── HomeServlet.java
- │ ├── AddTaskServlet.java
- │ ├── ListTasksServlet.java
- │ └── TaskStore.java
- └── webapp/
- ├── index.html
- ├── add.html
- └── WEB-INF/web.xml

---

##  How to Run

### Option 1: Jetty (No Tomcat Needed)

```bash
git clone https://github.com/yourname/mini-task-manager.git
cd mini-task-manager
mvn clean jetty:run
Visit: http://localhost:8080

Option 2: Deploy to Tomcat
---
Build the WAR:
bash
mvn clean package
---
Copy WAR file:
bash
cp target/mini-task-manager.war /path/to/tomcat/webapps/
---
Start Tomcat and visit:
http://localhost:8080/mini-task-manager/
---
How It Works
Tasks are stored in-memory using a static List<String> (no database).

You can add tasks via /add.html.

Tasks are listed dynamically at /list using ListTasksServlet.
---
