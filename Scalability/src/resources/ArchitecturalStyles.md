# Overview

Architecture styles is a family of architecture that share certain characteristics.

### Format for this guide.
1. Description and logical diagram of the style
2. Recommendation for when to choose this style
3. Benefit, challenges and best practice
    ### Benefit
    ### Challenges 
    ### best practice
    ### Constraints
    ### Examples
## N-Tier: 

Presentation
____
Business 
____
Data Access

### Benefits
    > Dependencies are managed by dividing application into layers
### Challenges
    Spagetthi architecture. Not suitable extendable changes. Making frequent updates a challenge
### Best Practice
    Natural fit for migrating existing applications that already use a layered architecture.

## Web-Queue-Worker

    As literally states, three step architecture with clearly defined operations for each step
    > Front end handles web requests.
    > Worker handles CPU intensive taks.
    > Communication works through asynchronous message queue.

## Microservices
    > Composed of many small *independent* services.
    > Each independent service implements a single business capability.
    Services are loosely coupled, communicating through API contracts.

### Benefit
    Each service can be built, managed and used independently.
    Faster development velocity and team engagement, when done right
### Challenges 
    More complex to implement entire architecture
### best practice
    Faster innovation and more resilient architecture.
### Constraints
    > A Service represents single responsibility
    > Every service is independent of others
    > Data is private to the service that owns it. Services do not share data.
### Example Domain:
    Complicated domain, Frequent updates expected.

## Event Driven architecture.
    Publisher-Subscriber archtiecture.
### Benefit
    Useful to make producer - consumer independent. And still be able to perform different types of processing for same event data.
### Challenges 
    ????
### best practice
    For applications that ingest and process a large volume of data with low latency requirements. eg. IoT solutions


## Big data, Big Compute





