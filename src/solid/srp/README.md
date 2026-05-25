# Single Responsibility Principle (SRP)

This module demonstrates the **Single Responsibility Principle (SRP)** — one of the five SOLID principles in object-oriented design.

> A class should have only one reason to change.

The goal is to understand how mixing multiple responsibilities inside a single class can lead to tightly coupled and difficult-to-maintain code.

---

# Problem Statement

We are designing a simple user management system.

The system performs multiple operations such as:
- user registration
- database saving
- email sending

---

# Bad Design

In the bad design approach, a single class handles:
- business logic
- database operations
- email functionality

This creates multiple responsibilities inside one class.

Problems with this approach:
- tightly coupled code
- difficult maintenance
- poor scalability
- harder testing
- multiple reasons to change the same class

Example:
- changing email provider affects the same class
- database-related changes also affect the same class

This violates the Single Responsibility Principle.

---

# Good Design

In the improved design:
- `UserService` handles user-related logic
- `DatabaseService` handles persistence
- `EmailService` handles email functionality

Each class now focuses on a single responsibility.

Benefits:
- better separation of concerns
- easier testing
- cleaner code structure
- improved maintainability
- better scalability

---

# Key Learning

A class should focus on a single responsibility or concern.

SRP helps in building:
- maintainable systems
- loosely coupled code
- scalable applications
- cleaner architecture

---

# Concepts Used

- SOLID Principles
- SRP
- Separation of Concerns
- Loose Coupling
- Object-Oriented Design

---

# Real-world Example

In real backend systems:
- authentication logic
- database logic
- notification logic
- reporting logic

are usually handled by separate services instead of one large class.

---

# Future Improvements

- Add interfaces for services
- Introduce Dependency Injection
- Apply Open Closed Principle (OCP)
- Add unit testing using Mockito

---