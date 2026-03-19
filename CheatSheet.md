# Design Patterns Cheat Sheet (No Flyweight)

## 1. Pattern → Trigger Phrase & Exercises

**Decorator (P1)**
*   **Trigger:** "Add behaviors dynamically," "stack features," "avoid class explosion (subclassing for every combination)."
*   **Exercise:** `Ex1_CarDecorator` (Adding features like Airbag, Color, Engine to a BasicCar).

**Factory Method (P2)**
*   **Trigger:** "Let subclasses decide which object to instantiate," "framework calls a method to create an object."
*   **Context:** Used when a class can't anticipate the class of objects it must create.

**Abstract Factory (P3)**
*   **Trigger:** "Create families of related objects," "ensure products from the same family are used together."
*   **Exercise:** `Ex1_ArchitectOffice` (Creating specific Doors and Windows for German vs. Dutch houses).

**Command (P4)**
*   **Trigger:** "Parameterize objects with operations," "undo/redo," "queue requests," "macro commands."
*   **Exercise:** `Ex01CarGame` (Mapping keys to car actions like Left, Right, Forward; supporting Undo).

**Adapter (P5)**
*   **Trigger:** "Make incompatible interfaces work together," "reuse legacy code with a new interface."
*   **Exercise:** `ExCoffeMachineCompany` (Using an `OldMachine` in a `ModernMachine` environment via a `CapsuleMachine` adapter).

**Template Method (P6)**
*   **Trigger:** "Define the skeleton of an algorithm," "subclasses implement specific steps," "invariant parts in base class."
*   **Exercise:** `Ex01Restaurant` (Common steps for preparing a meal, but specific cooking methods vary).

**State (P7)**
*   **Trigger:** "Object behavior changes based on internal state," "replace giant if/else or switch statements."
*   **Exercise:** `Ex1StatesOfACoffeeMachine` (Machine transitions between Idle, InsertingCoin, UserChoose, Dispensing).

**Builder (P8)**
*   **Trigger:** "Construct complex objects step-by-step," "same construction process, different representations."
*   **Exercise:** `Ex01BuildingCar` (Building a car part by part: chassis, engine, wheels).

**Chain of Responsibility (P9)**
*   **Trigger:** "Pass a request along a chain," "multiple objects can handle a request," "decouple sender and receiver."
*   **Exercise:** `Ex01GumballCorporation` (Handlers processing coins or requests in a sequence).

**Memento (P10)**
*   **Trigger:** "Save and restore state," "undo mechanism," "snapshot without exposing internal details."
*   **Exercise:** `Ex01VideoGame` (Saving game progress to restore later).

---

## 2. Quick Disambiguation (Crucial for Exam)

### Creational Patterns
*   **Abstract Factory vs. Builder**:
    *   **Abstract Factory**: Creates a *family* of related objects (e.g., WoodenDoor + WoodenWindow) in one go. The focus is on the *family*.
    *   **Builder**: Creates *one complex object* step-by-step (e.g., Car -> add Engine -> add Wheels). The focus is on the *process*.
*   **Factory Method vs. Abstract Factory**:
    *   **Factory Method**: Uses **Inheritance**. A method (`createProduct`) is overridden by a subclass to create one object.
    *   **Abstract Factory**: Uses **Composition**. An object (the factory) is passed around to create multiple related objects.

### Structural Patterns
*   **Adapter vs. Decorator**:
    *   **Adapter**: Changes the **interface** (makes square peg fit round hole). It adapts.
    *   **Decorator**: Keeps the **same interface** but adds **responsibility/behavior** (wraps a gift). It enhances.
*   **Decorator vs. Chain of Responsibility**:
    *   **Decorator**: The wrapper *adds* its action and *also* calls the wrapped object. Usually, **all** decorators run.
    *   **Chain of Responsibility**: A handler decides to *either* handle the request *or* pass it on. Usually, **only one** handler handles it (or the chain is broken).

### Behavioral Patterns
*   **Command vs. Memento (Undo logic)**:
    *   **Command**: Supports undo by knowing the **inverse action** (e.g., "Move Right" undoes "Move Left").
    *   **Memento**: Supports undo by restoring a **saved snapshot** of the state (e.g., "Restore to 10:00 AM state").
*   **State vs. Strategy**:
    *   **State**: The "strategy" (behavior) changes **automatically** based on internal state (e.g., Water becomes Ice when temp < 0). The object manages its own transitions.
    *   **Strategy**: The "strategy" is chosen **manually** by the client (e.g., User selects "Fast Route" or "Scenic Route").
*   **Template Method vs. Factory Method**:
    *   **Template Method**: Defines the **steps of an algorithm**.
    *   **Factory Method**: A specific step in that algorithm that creates an object. (Factory Method is often used *inside* a Template Method).

---

## 3. Decision Tree: "If the problem says X → pick Y"

1.  **Need to save/restore state (Undo/Snapshot) without exposing internals?**
    *   → **Memento** (Video Game Save)

2.  **Need to decouple sender & receiver; multiple objects *might* handle a request?**
    *   → **Chain of Responsibility** (Gumball Machine Handlers)

3.  **Need to execute actions (Undo/Redo, Queue, Macro) via buttons/keys?**
    *   → **Command** (Car Game Controls)

4.  **Need to add features dynamically (wrap objects) without inheritance explosion?**
    *   → **Decorator** (Car Features)

5.  **Need to ensure families of related objects (GUI themes, House parts) work together?**
    *   → **Abstract Factory** (Architect Office)

6.  **Need to make incompatible classes work together (Legacy vs. New)?**
    *   → **Adapter** (Coffee Machine)

7.  **Object changes behavior completely when its internal state changes?**
    *   → **State** (Coffee Machine States)

8.  **Complex object creation step-by-step?**
    *   → **Builder** (Building Car)

9.  **Algorithm skeleton is fixed, but specific steps vary?**
    *   → **Template Method** (Restaurant Cooking)

---

## 4. Minimal UML Sketches

**Decorator:** `Component <|-- ConcreteComponent` AND `Component <|-- Decorator o-- Component`
**Command:** `Invoker o-- Command` AND `Command <|.. ConcreteCommand` AND `ConcreteCommand --> Receiver`
**State:** `Context o-- State` AND `State <|.. ConcreteStateA`
**Adapter:** `Client --> Target` AND `Target <|.. Adapter` AND `Adapter --> Adaptee`
**Abstract Factory:** `Client --> AbstractFactory` AND `AbstractFactory <|.. ConcreteFactory` creates `AbstractProduct`
