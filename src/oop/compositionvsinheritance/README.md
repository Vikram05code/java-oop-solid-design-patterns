# Composition vs Inheritance

This module demonstrates one of the most important OOP design concepts:

> Favor Composition Over Inheritance

The goal is to understand:
- when inheritance works well
- where inheritance becomes problematic
- how composition provides better flexibility and scalability

---

# Problem Statement

We are designing a Bird system.

Some bird behaviors are common:
- eat()
- sleep()
- makeSound()

But flying behavior is not common to all birds.

Examples:
- Sparrow can fly
- Penguin cannot fly

---

# Bad Design (Inheritance Problem)

In the bad design approach:
- all birds inherit `fly()`
- Penguin is forced to inherit flying behavior
- this creates an incorrect hierarchy

Example problem:

```java
Penguin extends Bird
```

Even though penguins cannot fly.

This leads to:
- rigid design
- incorrect abstraction
- poor extensibility

---

# Good Design (Composition)

In the improved design:
- common behaviors remain inside `Bird`
- flying behavior is separated using composition

A `Bird` now HAS-A `FlyBehaviour`.

Different flying behaviors can be plugged in dynamically:
- `CanFly`
- `CannotFly`

This makes the system:
- flexible
- extensible
- loosely coupled

---

# Key Learning

Use inheritance for:
- stable shared behavior
- true IS-A relationships

Prefer composition when:
- behavior may vary
- behavior changes frequently
- flexibility is important

---

# Concepts Used

- OOP
- Inheritance
- Composition
- Delegation
- Polymorphism
- Loose Coupling

---

# Future Improvements

- Add more bird behaviors
- Introduce Strategy Pattern formally
- Add runtime behavior switching
- Add bird-specific subclasses when specialization is required

---