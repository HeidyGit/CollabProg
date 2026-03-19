# DP05 - Adapter Pattern

**Categorie GoF** : Structural | **Slides** : DP05 - Adapter Pattern

---

## Definition

> **The Adapter Pattern** converts the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

En résumé : L'Adapter agit comme un traducteur. Il prend une classe existante (l'**Adaptee**) et l'enveloppe dans un nouvel objet qui a l'interface attendue par le client (la **Target**).

### Use Cases & Benefits

- **Integrating Legacy Code:** Allows you to use older classes with modern interfaces without rewriting the old code.
- **Third-Party Libraries:** If you use a library whose interface doesn't match your application's standards, you can create an adapter for it.
- **Decoupling:** The client code is not tightly coupled to the specific implementation of the adaptee; it only knows about the target interface.

---

## Diagramme de classes (Object Adapter)

```
                 ┌──────────────────┐               ┌──────────────────┐
                 │      Client      │───uses───────▶│      Target      │
                 └──────────────────┘               │   (Interface)    │
                                                    │------------------│
                                                    │ + request()      │
                                                    └────────┬─────────┘
                                                             │
                                                             ▲
                                                             │ implements
                                                    ┌────────┴─────────┐
                                                    │      Adapter     │
                                                    │------------------│
                                                    │ - adaptee: Adaptee│
                                                    │------------------│
                                                    │ + request()      │
                                                    └────────┬─────────┘
                                                             │
                                                             │ has-a
                                                             ▼
                                                    ┌──────────────────┐
                                                    │      Adaptee     │
                                                    │  (Existing Class)│
                                                    │------------------│
                                                    │ + specificRequest()│
                                                    └──────────────────┘
```

---

## Les Participants (avec l'exemple de la machine à café)

| Participant | Role | `Template` | `ExCoffeMachineCompany`                                                                                      |
|---|---|---|--------------------------------------------------------------------------------------------------------------|
| **Target** | L'interface attendue par le client. | `Target.java` | `Machine.java` (L'ingénieur ne sait utiliser que les machines modernes)                                      |
| **Client** | Le code qui interagit avec la `Target`. | `AdapterTest.java` | ` Machine.java` (and) ` Engineer.java`                                                                       |
| **Adaptee** | La classe existante avec une interface incompatible. | `Adaptee.java` | `OldMachine.java` (La vieille machine qui fait du café filtre)                                               |
| **Adapter** | La classe qui fait le lien entre la `Target` et l' `Adaptee`. | `Adapter.java` | `CapselMachine.java` (and) `Machine.java` (L'adaptateur qui fait fonctionner la vieille machine comme une machine moderne) |

## Structure du package `Template`

```
Template/
├── Target.java                 # Target (Interface)
├── Adapter.java                # Adapter
├── Adaptee.java                # Adaptee
└── AdapterTest.java            # Client (main)
```