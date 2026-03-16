# DP08 - Builder Pattern

**Categorie GoF** : Creational | **Slides** : DP08 - Builder Pattern

---

## Definition

> **The Builder Pattern** separates the construction of a complex object from its representation so that the same construction process can create different representations.

En résumé : Le pattern Builder permet de construire des objets complexes étape par étape. Il sépare la logique de construction de l'objet de sa représentation finale. Cela signifie que le même processus de construction peut être utilisé pour créer différentes versions ou configurations d'un objet.

---

## Diagramme de classes

```
                    ┌───────────────────┐
                    │     Director      │
                    │------------------ │
                    │ - builder: Builder│
                    │------------------ │
                    │ + construct()     │  // Uses builder to construct product
                    └────────┬──────────┘
                             │
                             │ uses
                             ▼
                    ┌──────────────────┐
                    │     Builder      │
                    │   (Interface)    │
                    │------------------│
                    │ + buildPartA()   │
                    │ + buildPartB()   │
                    │ + getResult()    │
                    └────────┬─────────┘
                             │
                             ▲
                             │ implements
                             │
                    ┌──────────────────┐
                    │  ConcreteBuilder │
                    │------------------│
                    │ - product: Product│
                    │------------------│
                    │ + buildPartA()   │  // Implements building steps
                    │ + buildPartB()   │
                    │ + getResult()    │  // Returns the constructed product
                    └────────┬─────────┘
                             │
                             │ creates
                             ▼
                    ┌──────────────────┐
                    │      Product     │
                    │------------------│
                    │ + partA          │
                    │ + partB          │
                    └──────────────────┘
```

---

## Les Participants

| Participant | Role | A retenir |
|---|---|---|
| **Product** | L'objet complexe à construire. | Représente l'objet final qui est construit par le Builder. |
| **Builder** | Interface ou classe abstraite. | Définit les étapes de construction pour les différentes parties du `Product`. |
| **ConcreteBuilder** | Implémente l'interface `Builder`. | Construit et assemble les parties du produit en fournissant une implémentation spécifique des étapes de construction. |
| **Director** | Gère le processus de construction. | Utilise un objet `Builder` pour construire un `Product` en suivant une séquence d'étapes. |
| **Client** | Le code qui utilise le pattern. | Crée un objet `Director` et un objet `ConcreteBuilder`, puis demande au `Director` de construire le produit. |

## Structure du package

```
P8BuilderPattern/
├── Builder.java                # Builder (Interface)
├── ConcreteBuilder.java        # ConcreteBuilder
├── Director.java               # Director
├── Product.java                # Product
├── Client.java                 # Client (main)
└── Ex01Car/                    # Exemple spécifique d'utilisation du Builder
    └── ...
```