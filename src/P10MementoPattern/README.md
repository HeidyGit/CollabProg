# DP10 - Memento Pattern

**Categorie GoF** : Behavioral | **Slides** : DP10 - Memento Pattern

---

## Definition

> **The Memento Pattern** captures and externalizes an object's internal state so that the object can be restored to this state later, without violating encapsulation.

En résumé : On utilise un objet "Memento" pour stocker une capture instantanée (un "snapshot") de l'état d'un objet "Originator". Ce Memento peut ensuite être utilisé pour restaurer l'Originator à cet état.

### Key Concept: Encapsulation

Crucially, the Memento pattern preserves the encapsulation of the Originator. The Memento object is opaque to other objects (like the Caretaker); only the Originator knows how to access the internal state stored within the Memento. This is often achieved by making the Memento an inner class or by using limited access modifiers.

### Use Cases

- **Undo/Redo:** Providing users with the ability to undo their actions in text editors, graphic software, etc.
- **Save Games:** Saving the progress of a video game so the player can resume later.
- **Rollback:** In database transactions, to return to a known consistent state if an error occurs.

---

## Diagramme de classes

```
  ┌──────────────────┐       Creates        ┌──────────────────┐
  │    Originator    │─────────────────────▶│     Memento      │
  │------------------│                      │------------------│
  │ - state          │                      │ - state          │
  │------------------│                      │------------------│
  │ + createMemento()│                      │ + getState()     │
  │ + setMemento()   │                      │ + setState()     │
  └──────────────────┘                      └──────────────────┘
           ▲                                         ▲
           │                                         │
           │                                         │
           │                                         │
  ┌────────┴─────────┐                               │
  │    Caretaker     │───────────────────────────────┘
  │------------------│          Manages
  │ - memento        │
  └──────────────────┘
```

---

## Les Participants

| Participant | Role | A retenir |
|---|---|---|
| **Originator** | L'objet dont on veut sauvegarder l'état. | Crée un Memento contenant son état actuel et peut restaurer son état à partir d'un Memento. |
| **Memento** | L'objet de stockage. | Stocke l'état interne de l'Originator. Il protège cet état contre l'accès par d'autres objets que l'Originator. |
| **Caretaker** | Le gardien des Mementos. | Responsable de la conservation du Memento, mais n'opère jamais sur son contenu. |

## Structure du package

```
P10MementoPattern/
├── Originator.java             # Originator : Creates and restores mementos
├── CareTaker.java              # Caretaker : Manages mementos
├── Test.java                   # Client : Orchestrates the process

```