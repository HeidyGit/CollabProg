# DP03 - Abstract Factory Pattern

**Categorie GoF** : Creational | **Slides** : DP03 - Abstract Factory

---

## Definition

> **The Abstract Factory Pattern** provides an interface for creating families of related or dependent objects without specifying their concrete classes.

En résumé : on définit une "super-fabrique" (Abstract Factory) qui sait comment créer une famille complète de produits. Chaque "fabrique concrète" (Concrete Factory) implémente cette interface pour créer les produits d'un style spécifique (par exemple, des meubles de style Victorien ou Moderne).

---

## Diagramme de classes

```
                                  ┌──────────────────────┐
                                  │   AbstractFactory    │
                                  │(Interface ou Abstraite)│
                                  │ + CreateProductA()   │
                                  │ + CreateProductB()   │
                                  └──────────┬───────────┘
                                             │
                         ┌───────────────────┴───────────────────┐
                         │                                       │
           ┌─────────────┴──────────┐              ┌─────────────┴──────────┐
           │   ConcreteFactory1     │              │   ConcreteFactory2     │
           │                        │              │                        │
           │ + CreateProductA()     │              │ + CreateProductA()     │
           │ + CreateProductB()     │              │ + CreateProductB()     │
           └────────────────────────┘              └────────────────────────┘
                         │ create                                │ create
                         ▼                                       ▼
             ┌─────────────────────┐                   ┌─────────────────────┐
             │      ProductA1      │                   │      ProductA2      │
             └─────────────────────┘                   └─────────────────────┘
                         ▲                                       ▲
                         │ implements                            │ implements
             ┌─────────────────────┐                   ┌─────────────────────┐
             │    AbstractProductA │                   │    AbstractProductB │
             └─────────────────────┘                   └─────────────────────┘
                         │                                       │
                         │ implements                            │ implements
                         ▼                                       ▼
             ┌─────────────────────┐                   ┌─────────────────────┐
             │      ProductB1      │                   │      ProductB2      │
             └─────────────────────┘                   └─────────────────────┘
```

---

## Les Participants

| Participant | Role | A retenir |
|---|---|---|
| **AbstractFactory** | Interface ou classe abstraite | Définit les méthodes pour créer chaque produit abstrait (`createProductA`, `createProductB`). |
| **ConcreteFactory** | Les fabriques concrètes | Implémentent les méthodes pour créer des produits concrets d'une famille spécifique. |
| **AbstractProduct** | Interface ou classe abstraite | Définit le type de base pour une famille de produits (ex: `ProductA`, `ProductB`). |
| **ConcreteProduct** | Les produits concrets | Les objets réels créés par les fabriques concrètes. |
| **Client** | Le code qui utilise le pattern | Utilise l'interface `AbstractFactory` et `AbstractProduct` pour rester indépendant des classes concrètes. |

## Structure du package

```
BasePattern/
├── AbstractFactory.java        # Interface AbstractFactory
├── ConcreteFactory1.java       # ConcreteFactory : crée les produits de type 1
├── ConcreteFactory2.java       # ConcreteFactory : crée les produits de type 2
│
├── AbstractProductA.java       # Interface AbstractProduct pour le type A
├── ProductA1.java              # ConcreteProduct
├── ProductA2.java              # ConcreteProduct
│
├── AbstractProductB.java       # Interface AbstractProduct pour le type B
├── ProductB1.java              # ConcreteProduct
├── ProductB2.java              # ConcreteProduct
│
└── Client.java                 # Client (main) qui utilise les fabriques
```