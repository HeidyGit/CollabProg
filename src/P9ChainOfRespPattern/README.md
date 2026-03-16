# DP09 - Chain of Responsibility Pattern

**Categorie GoF** : Behavioral | **Slides** : DP09 - Chain of Responsibility

---

## Definition

> **The Chain of Responsibility Pattern** avoids coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

En résumé : On crée une chaîne d'objets "handlers". Chaque handler décide soit de traiter une requête, soit de la passer au handler suivant dans la chaîne. L'objet qui envoie la requête (le client) ne sait pas quel objet la traitera finalement.

### Use Cases & Benefits

- **Decoupling:** The sender of a request doesn't need to know the structure of the chain or which object will handle the request.
- **Flexibility:** You can add or remove handlers from the chain at runtime, or change their order.
- **Event Handling:** Commonly used in GUI programming to handle events (e.g., a click event bubbling up from a button to its parent containers).
- **Middleware:** Web frameworks often use this pattern for processing HTTP requests, where each handler in the chain might add a layer of functionality (authentication, logging, caching, etc.).

---

## Diagramme de classes

```
                    ┌──────────────────┐
                    │     Handler      │
                    │   (Abstract)     │
                    │------------------│
                    │ - successor: Handler│
                    │------------------│
                    │ + handleRequest()│  // Can be abstract or have default implementation
                    └────────┬─────────┘
                             │
                             ▲
                             │ extends
            ┌────────────────┴────────────────┐
            │                                 │
  ┌─────────┴─────────┐             ┌─────────┴─────────┐
  │ ConcreteHandler1  │             │ ConcreteHandler2  │
  │-------------------│             │-------------------│
  │ + handleRequest() │------------▶│ + handleRequest() │
  └───────────────────┘  successor  └───────────────────┘
```

---

## Les Participants

| Participant | Role | A retenir |
|---|---|---|
| **Handler** | Interface ou classe abstraite. | Définit l'interface pour traiter les requêtes et maintient une référence vers le "successeur" dans la chaîne. |
| **ConcreteHandler** | Implémente la logique de traitement. | Décide s'il peut traiter la requête. Si non, il la délègue à son successeur. |
| **Client** | Le code qui initie la requête. | Envoie la requête au premier handler de la chaîne. |
| **Request** | (Optionnel) Un objet qui encapsule les données de la requête. | Permet de passer des informations complexes le long de la chaîne. |

## Structure du package

```
P9ChainOfRespPattern/
├── Handler.java                # Handler (Abstract Class)
├── ConcreteHandler1.java       # ConcreteHandler
├── ConcreteHandler2.java       # ConcreteHandler
├── ConcreteHandler3.java       # ConcreteHandler
├── Request.java                # Request object
├── Client.java                 # Client (main)

```