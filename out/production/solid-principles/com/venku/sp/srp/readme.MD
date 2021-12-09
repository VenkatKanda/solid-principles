Single Responsibility Principle
...............................

As the name suggests, this principle states that each class should have one responsibility, one single purpose. This means that a class will do only one job, which leads us to conclude it should have only one reason to change.

Following the SRP principle, our classes will adhere to one functionality. Their methods and data will be concerned with one clear purpose. This means high cohesion, as well as robustness, which together reduce errors.

Cohesion is the degree to which the elements inside a module belong together. A module could be a class or a package or even a microservice. Simply put, it means “the code that changes together, stays together”.

A module with high cohesion contains elements that are tightly related to each other and united in their purpose. For example, all the methods within a User class should represent the user behavior.

A module is said to have low cohesion if it contains unrelated elements. For example, a User class containing a method on how to validate the email address. User class can be responsible for storing the email address of the user but not for validating it or sending an email:

Coupling is the degree of interdependence between software modules. A module could be a class or a package or even a microservice. Effectively, the coupling is about how changing one thing required change in another.


the Single Responsibility (SRP) that stated that a module should have only one reason to change. 
