# Notification System Design

## Problem

Design a notification system supporting multiple notification types such as:
- Email
- SMS
- Push Notification

---

## Initial Bad Design

The initial implementation used multiple if-else conditions inside a single service class.

Problems:
- Tight coupling
- Difficult to extend
- Violates Open Closed Principle (OCP)

---

## Refactored Design

The system was refactored using:
- Interfaces
- Polymorphism
- Abstraction

Each notification type now implements a common Notification interface.

---

## Concepts Used

- OOP
- Polymorphism
- Abstraction
- Open Closed Principle (OCP)

---

## Future Improvements

- Factory Pattern
- Strategy Pattern
- Dependency Injection