#Introduction:

Cloud is changing the way applications are designed.
Intead of _monoliths_, applications are decomposed into _smaller decentralized_ services
These services communicate through _API_- Appplication Programmable Interfaces, or by _asynchronous messaging_ or _eventing_. Applications are scaled horizontally adding new instances as demand requires.

This brings new *challenges*:
1. *State* of applications are _distributed_.
2. Operations are done in parallel and asynchronously. 
3. System must be resilient when failure occurs.
4. Deployments must be automated and predictible.
5. Monitor and telemtry are crtical for key metric analysis into system.
