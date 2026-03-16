# DP07 - State Pattern

**Categorie GoF** : Behavioral | **Slides** : DP07 - State Pattern

---

## Definition

> **The State Pattern** allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

En résumé : On encapsule les comportements liés à des états spécifiques dans des classes distinctes. L'objet principal (le "Contexte") contient une référence vers l'état actuel et délègue les actions à cet objet d'état. Quand un changement d'état est nécessaire, le contexte change simplement sa référence pour pointer vers un nouvel objet d'état.

---

## Diagramme de classes

```
                 ┌──────────────────┐
                 │     Context      │
                 │------------------│
                 │ - state: State   │
                 │------------------│
                 │ + request()      │  // Delegates to state.handle()
                 │ + setState()     │
                 └────────┬─────────┘
                          │
                          │ owns a
                          ▼
                 ┌──────────────────┐
                 │      State       │
                 │   (Interface)    │
                 │------------------│
                 │ + handle()       │
                 └────────┬─────────┘
                          │
                          ▲
                          │ implements
            ┌─────────────┴─────────────┐
            │                           │
  ┌─────────┴─────────┐       ┌─────────┴─────────┐
  │    OnState        │       │    OffState       │
  │  (ConcreteState)  │       │  (ConcreteState)  │
  │-------------------│       │-------------------│
  │ + handle()        │       │ + handle()        │
  └───────────────────┘       └───────────────────┘
```

---

## Les Participants

| Participant | Role | A retenir |
|---|---|---|
| **Context** | L'objet dont le comportement change. | Maintient une instance d'un `ConcreteState` qui définit l'état actuel. |
| **State** | Interface ou classe abstraite. | Définit une interface commune pour tous les états concrets. |
| **ConcreteState** | Les classes d'état spécifiques. | Chaque classe implémente un comportement associé à un état du `Context`. |

## Structure du package

```
Template/
├── Context.java                # Context
├── State.java                  # State (Interface)
├── OnState.java                # ConcreteState
├── OffState.java               # ConcreteState
└── Test.java                   # Client (main)
```