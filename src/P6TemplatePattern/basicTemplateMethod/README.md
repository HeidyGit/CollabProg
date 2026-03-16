# DP06 - Template Method Pattern

**Categorie GoF** : Behavioral | **Slides** : DP06 - Template Method Pattern

---

## Definition

> **The Template Method Pattern** defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

En résumé : Une classe abstraite (AbstractClass) contient une méthode "template" (templateMethod) qui définit l'ordre des étapes d'un algorithme. Certaines de ces étapes sont des méthodes abstraites (primitive operations) que les sous-classes concrètes (ConcreteClass) doivent implémenter. Cela garantit que la structure de l'algorithme reste la même, mais que les détails de certaines étapes peuvent varier.

---

## Diagramme de classes

```
                    ┌──────────────────┐
                    │  AbstractClass   │
                    │ + templateMethod()│  // Defines algorithm skeleton
                    │ # primitiveOp1() │  // Abstract, to be implemented by subclasses
                    │ # primitiveOp2() │  // Abstract, to be implemented by subclasses
                    └────────┬─────────┘
                             │
                             ▲
                             │ extends
                             │
                    ┌──────────────────┐
                    │  ConcreteClass   │
                    │ + primitiveOp1() │  // Implements specific steps
                    │ + primitiveOp2() │  // Implements specific steps
                    └──────────────────┘
```

---

## Les Participants

| Participant | Role | A retenir |
|---|---|---|
| **AbstractClass** | Définit la méthode template et les opérations primitives abstraites. | La méthode template appelle les opérations primitives dans un ordre fixe. |
| **ConcreteClass** | Implémente les opérations primitives pour fournir un comportement spécifique à la sous-classe. | Ne modifie pas la structure de l'algorithme définie par la méthode template. |
| **Client** | Invoque la méthode template sur une instance de `ConcreteClass`. | Interagit avec l'AbstractClass, sans connaître les détails de l'implémentation concrète. |

## Structure du package

```
basicTemplateMethod/
├── AbstractClass.java          # AbstractClass
├── ConcreteClass.java          # ConcreteClass
└── Test.java                   # Client (main)
```