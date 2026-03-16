# DP01 - Decorator Pattern

**Categorie GoF** : Structural | **Slides** : DP01 - Decorator Pattern

---

## Definition (slide 11)

> **The Decorator Pattern** attaches additional responsibilities to an object dynamically.
> Decorators provide a flexible alternative to subclassing for extending functionality.

En resume : on **enveloppe** (wrap) un objet dans un autre objet qui ajoute un comportement,
sans modifier la classe d'origine.

---

## Diagramme de classes (slide 12, 22)

```
                    ┌──────────────────┐
                    │    Component     │◄────────────────────────┐
                    │   (abstraite)    │                         │
                    │  Operation()     │                         │
                    └────────┬─────────┘                         │
                             │                                   │
                ┌────────────┴────────────┐                      │
                │                         │                      │
  ┌─────────────┴──────────┐  ┌───────────┴──────────┐           │
  │  ConcreteComponent     │  │     Decorator        │ ◇─────────┘
  │                        │  │   (abstraite)        │  component
  │  Operation()           │  │                      │  (HAS-A)
  └────────────────────────┘  │  Operation()         │
                              └──────────┬───────────┘
                                         │
                              ┌──────────┴───────────┐
                              │                      │
                ┌─────────────┴────────┐ ┌───────────┴──────────┐
                │ ConcreteDecoratorA   │ │ ConcreteDecoratorB   │
                │                      │ │                      │
                │ Operation()          │ │ Operation()          │
                │ addedState           │ │ AddedBehavior()      │
                └──────────────────────┘ └──────────────────────┘
```

---

## Les 4 participants (slide 22)

| Participant | Role | A retenir |
|---|---|---|
| **Component** | Interface ou classe abstraite commune | Definit `Operation()` que tout le monde implemente |
| **ConcreteComponent** | L'objet de base qu'on va decorer | C'est lui qui est au centre de l'enveloppe |
| **Decorator** | Classe abstraite qui **HAS-A** un Component | Contient une reference vers le composant enveloppe |
| **ConcreteDecorator** | Ajoute un comportement concret | Delegue au composant puis ajoute son propre comportement |

## Structure du package

```
carFeatures/
├── cars/                              # Component + ConcreteComponents
│   ├── Car.java                       # Component (classe abstraite)
│   ├── CarBerlin.java                 # ConcreteComponent : berline
│   ├── CarSport.java                  # ConcreteComponent : voiture sport
│   └── CarBreak.java                  # ConcreteComponent : break
│
├── features/                          # Decorator + ConcreteDecorators
│   ├── featureDecorator.java          # Decorator (classe abstraite, HAS-A Car)
│   ├── ColorDecorator.java            # ConcreteDecorator : option couleur
│   ├── EngineDecorator.java           # ConcreteDecorator : option moteur
│   ├── AirbagDecorator.java           # ConcreteDecorator : option airbag
│   ├── BreakingSystemDecorator.java   # ConcreteDecorator : systeme de freinage
│   └── AntiSlidingSystemDecorator.java # ConcreteDecorator : systeme anti-derapage
│
└── CarDecoratorLauncher.java          # Client (main)
```