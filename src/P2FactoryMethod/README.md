# DP02 - Factory Method Pattern

**Categorie GoF** : Creational | **Slides** : DP02 - Factory Method Pattern

---

## Definition (slide 18)

> **The Factory Method Pattern** defines an interface for creating an object,
> but **lets subclasses decide** which class to instantiate.
> Factory Method lets a class defer instantiation to subclasses.

En resume : le Creator definit UNE methode abstraite pour creer un objet.
Chaque sous-classe (ConcreteCreator) redefinit cette methode pour retourner
un type concret different. Le Creator n'a **jamais besoin de savoir** quel objet est cree.

---

## Diagramme de classes (slide 19, 20)

```
  ┌───────────────────┐                    ┌──────────────────────────┐
  │     Product       │                    │        Creator           │
  │   (interface)     │                    │      (abstraite)         │
  │                   │                    │                          │
  │                   │                    │  FactoryMethod()         │ ◄── abstraite
  └────────┬──────────┘                    │  AnOperation()           │ ──► appelle FactoryMethod()
           │                               └─────────────┬────────────┘
           │ implements                                  │ extends
           │                                             │
  ┌────────┴──────────┐                    ┌─────────────┴────────────┐
  │  ConcreteProduct  │ ◄─── cree ───────  │    ConcreteCreator       │
  │                   │                    │                          │
  │                   │                    │  FactoryMethod()         │ ──► return new ConcreteProduct
  └───────────────────┘                    └──────────────────────────┘
```

---

## Les 4 participants (slide 19, 20)

| Participant | Role | A retenir |
|---|---|---|
| **Product** | Interface des objets crees | Le Creator ne connait QUE cette interface |
| **ConcreteProduct** | Implementation concrete du Product | N'est mentionne QUE dans son ConcreteCreator |
| **Creator** | Classe abstraite avec la factory method + logique metier | `AnOperation()` appelle `FactoryMethod()` sans savoir quel produit est cree |
| **ConcreteCreator** | Redefinit la factory method | Le SEUL endroit qui fait `new ConcreteProduct()` |

---

## Parallele avec le cours (Pizza Store, slide 10-16)

| Cours (Pizza) | Exercice (House) | Participant GoF |
|---|---|---|
| `Pizza` | `Wall` | Product |
| `NYStyleCheesePizza` | `GlassWall` | ConcreteProduct |
| `PizzaStore` | `House` | Creator |
| `NYPizzaStore` | `GlassHouse` | ConcreteCreator |
| `createPizza()` | `createWall()` | FactoryMethod |
| `orderPizza()` | `buildHouse()` | AnOperation |

---

## Structure du package

```
carCompany/
├── product/                       # Product (interface/classe abstraite)
│   └── Car.java                   # Interface commune des voitures
│
├── concreteProducts/              # ConcreteProducts
│   ├── CoupeProduct.java         # Voiture coupe
│   ├── MinivanProduct.java       # Voiture minivan
│   └── PickupProduct.java        # Voiture pickup
│
├── creator/                       # Creator (classe abstraite)
│   └── CarCreator.java           # Declare la factory method abstraite
│
├── concreteCreators/              # ConcreteCreators
│   ├── CoupeCreator.java         # createCar() -> new CoupeProduct()
│   ├── MinivanCreator.java       # createCar() -> new MinivanProduct()
│   └── PickupCreator.java        # createCar() -> new PickupProduct()
│
└── Program.java                   # Client (main)