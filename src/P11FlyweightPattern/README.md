# DP11 - Flyweight Pattern

**Categorie GoF** : Structural | **Slides** : DP11 - Flyweight Pattern

---

## Definition

> **The Flyweight Pattern** uses sharing to support large numbers of fine-grained objects efficiently.

En résumé : Quand on a besoin de créer un très grand nombre d'objets similaires qui consomment beaucoup de mémoire, on peut utiliser le pattern Flyweight. L'idée est de séparer l'état d'un objet en deux parties : l'état **intrinsèque** (partagé et immuable) et l'état **extrinsèque** (unique et fourni par le client).

### Intrinsic vs. Extrinsic State

- **Intrinsic State:** C'est l'information qui est indépendante du contexte de l'objet et qui peut être partagée entre plusieurs objets. Par exemple, la lettre 'A' dans un éditeur de texte a une police et une taille qui peuvent être partagées. Cette partie est stockée dans l'objet Flyweight.
- **Extrinsic State:** C'est l'information qui dépend du contexte et ne peut pas être partagée. Par exemple, la position (ligne, colonne) de la lettre 'A' sur la page. Cette partie est fournie par le client à la volée et n'est pas stockée dans l'objet Flyweight.

### Use Cases

- **Text Editors:** Representing characters. The character itself ('A', 'B', etc.) is intrinsic, while its position on the page is extrinsic.
- **Game Engines:** Rendering trees, rocks, and other scenery. The mesh and textures of a tree are intrinsic, while its position in the world is extrinsic.
- **Data Structures:** Implementing data structures like `String` pools in Java, where multiple string literals with the same value point to the same object in memory.

---

## Diagramme de classes

```
                                     ┌────────────────────┐
                                     │ FlyweightFactory   │
                                     │--------------------│
                                     │ - flyweights: Map  │
                                     │--------------------│
                                     │ + getFlyweight()   │
                                     └──────────┬─────────┘
                                                │ creates/manages
                                                ▼
┌──────────────────┐               ┌────────────────────┐
│      Client      │───uses───────▶│     Flyweight      │
└──────────────────┘               │    (Interface)     │
                                   │--------------------│
                                   │ + operation()      │
                                   └──────────┬─────────┘
                                              │
                                              ▲ extends/implements
                                              │
                         ┌────────────────────┴────────────────────┐
                         │                                         │
               ┌─────────┴──────────┐                  ┌───────────┴────────────┐
               │ ConcreteFlyweight  │                  │ UnsharedConcreteFlyweight│
               │--------------------│                  │--------------------------│
               │ - intrinsicState   │                  │ - allState               │
               │--------------------│                  │--------------------------│
               │ + operation()      │                  │ + operation()            │
               └────────────────────┘                  └──────────────────────────┘
```

---

## Les Participants

| Participant | Role | A retenir |
|---|---|---|
| **Flyweight** | Interface ou classe abstraite. | Définit l'interface pour les objets qui peuvent recevoir un état extrinsèque. |
| **ConcreteFlyweight** | Implémente l'interface Flyweight. | Stocke l'état intrinsèque. Les objets de cette classe doivent être partageables. |
| **UnsharedConcreteFlyweight** | (Optionnel) Des objets qui ne sont pas partagés. | Pas tous les objets Flyweight ont besoin d'être partagés. |
| **FlyweightFactory** | Gère la création et le partage des objets Flyweight. | Assure que les flyweights sont partagés correctement. C'est le seul point d'accès pour créer des flyweights. |
| **Client** | Maintient une référence aux flyweights. | Calcule ou stocke l'état extrinsèque et le passe aux méthodes du Flyweight. |

## Structure du package

```
P11FlyweightPattern/
├── Flyweight.java                # Flyweight (Interface)
├── ConcreteFlyweight.java        # ConcreteFlyweight
├── UnsharedConcreteFlyweight.java# UnsharedConcreteFlyweight
├── FlyweightFactory.java         # FlyweightFactory
└── TestFlyweight.java            # Client (main)
```