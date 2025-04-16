 Spring CRUD Project

 📌 Описание

Проект демонстрирует реализацию базовых CRUD-операций (Create, Read, Update, Delete) с использованием Spring Boot, Spring Data JPA и базой данных.

 ⚙️ Технологии

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL (или H2 для тестов)
- Maven / Gradle
- Lombok

 📁 Структура проекта

- `controller` — REST-контроллеры
- `service` — бизнес-логика
- `repository` — интерфейсы для работы с БД
- `model/entity` — сущности
- `dto` (если есть) — классы для передачи данных
- `application.properties` — конфигурация подключения

 🔧 Как запустить

1. Установите PostgreSQL и создайте БД (если используется PostgreSQL)
2. Пропишите параметры подключения в `application.properties`
3. Соберите и запустите приложение:


   Открываем браузер, вводим http://localhost:7070/employees/list, и перед нами открывается интерфейс:
![image](https://github.com/user-attachments/assets/ba314041-cc6f-4f28-a394-ab839883b8a5)
Есть возможность создавать, изменять, удалять данные.
