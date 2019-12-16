# What are microservices?

Microservices are small, independent and loosely coupled services.
Generally, a single team owns, builds and maintains this service.
A services can be updated without rebuilding and redeploying entire application

> Services are responsible for persisting their own data

Services communicate with each other by using well-defined API's. Internal implementation details are hidden from other services. Encapsulation


#### Management and Orchestration
    Managing (spawning, rebalancing, failure tolerance of services) across nodes.
#### API Gateway
> API gateway is the entry point for clients. Instead of calling services directly.
Clients call the API gateway.
API gateway then fowards the call to appropriate service on the backend

**Functions of API Gateway**
    1. Decouples clients from services
    2. Services can be versioned/ refactored without needing to update clients
    3. API gateway performs cross cutting functions such as authentication, logging, SSL termination and load balancing

### Benefits:
    1. Agility
    2. Fault isolation
    3. Small focused team
    4. Small code base
    5. Right mix of tools which can solve your problem
    6. Scalability
    7. Data isolation

### Challenges:
    1. Complexity
    2. Development and Testing inhouse
    3. Lack of governance
    4. Network congestion and latency *Use Serialization*
   
### Best practices:
    1. Model services around business domain
    2. **Decentralize everything**
    3. Data storage must be private to the service that uses it.
    4. Avoid coupling between services
    5. Offload internal communication eg. SSL, Authentication etc..
    6. Business rules or domain knowledge is out of the gateway.
    7. Isolate failures. Resiliency patterns
    8. 