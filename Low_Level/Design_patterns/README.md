Here are the **Top 7 Design Patterns (80/20 interview version)** with:

✔ Definition
✔ Purpose
✔ When to use
✔ Real-world example

This is exactly what interviewers expect.

---

# 🧠 1. SINGLETON PATTERN

## 📌 Definition

Ensures a class has **only one instance** and provides a global access point.

## 🎯 Purpose

Control object creation → avoid multiple objects (like DB connection).

## 📍 When to use

* Database connection
* Logger class
* Configuration manager
* Spring Beans (default singleton)

## 🌍 Example

* Spring `@Service` beans
* Logging system (Log4j)

---

# 🏭 2. FACTORY PATTERN

## 📌 Definition

Creates objects without exposing the creation logic to the client.

## 🎯 Purpose

Centralize object creation logic.

## 📍 When to use

* When object type depends on input
* Payment system (UPI/Card/Cash)
* Vehicle creation system

## 🌍 Example

* Spring BeanFactory
* Payment gateway selection (Razorpay/Stripe)

---

# 🎯 3. STRATEGY PATTERN

## 📌 Definition

Allows selecting algorithm/behavior at runtime.

## 🎯 Purpose

Avoid multiple if-else conditions for different behaviors.

## 📍 When to use

* When multiple algorithms exist for same task
* Payment methods
* Sorting strategies

## 🌍 Example

* Payment method selection (UPI/Card/Wallet)
* Compression algorithms (ZIP/RAR)

---

# 👀 4. OBSERVER PATTERN

## 📌 Definition

Defines one-to-many dependency so when one object changes, all dependents are notified.

## 🎯 Purpose

Event-driven communication system.

## 📍 When to use

* Real-time updates
* Notification systems
* Event broadcasting

## 🌍 Example

* YouTube subscribers
* Stock market alerts
* WhatsApp group messages

---

# 🏗 5. BUILDER PATTERN

## 📌 Definition

Constructs complex objects step by step.

## 🎯 Purpose

Avoid telescoping constructors (too many parameters).

## 📍 When to use

* Object has many optional fields
* Immutable object creation

## 🌍 Example

* StringBuilder
* HTTP request builders
* Lombok @Builder

---

# 🔌 6. ADAPTER PATTERN

## 📌 Definition

Converts one interface into another expected by client.

## 🎯 Purpose

Make incompatible systems work together.

## 📍 When to use

* Third-party API integration
* Legacy system integration
* Interface mismatch problem

## 🌍 Example

* Payment gateway integration (Stripe → system)
* Mobile charger adapters

---

# 🎨 7. DECORATOR PATTERN

## 📌 Definition

Adds new behavior to an object dynamically without changing its structure.

## 🎯 Purpose

Extend functionality at runtime.

## 📍 When to use

* Add features dynamically
* Avoid subclass explosion
* Multiple combinations of features

## 🌍 Example

* Java I/O Streams (BufferedInputStream)
* Coffee add-ons (milk, sugar)
* Spring Security filters

---

# 🚀 FINAL 80/20 SUMMARY (VERY IMPORTANT)

| Pattern   | Core Idea                       |
| --------- | ------------------------------- |
| Singleton | One object only                 |
| Factory   | Object creation hidden          |
| Strategy  | Change behavior at runtime      |
| Observer  | Event notification system       |
| Builder   | Step-by-step object creation    |
| Adapter   | Convert interface compatibility |
| Decorator | Add features dynamically        |

---
