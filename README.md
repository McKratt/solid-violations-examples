# solid-violations-examples
A set of code examples violating SOLID Principles

## Definitions

### Single Responsability Principle (SRP)

> A class should have only one reason to change

The example here is inspired from the book *"Agile Software Development : Principles, Patterns and Practices"* of Robert C. Martin.

Suppose we have an [**Employee** class](/src/main/java/net/bakaar/solidviolation/srp/Employee.java) that it has two methods :

![Employee class](/doc/images/EmployeeExampleSRP.png)

See [**SRPViolationTest**](src/test/java/net/bakaar/solidviolation/srp/SRPViolationTest.java) for details

<u>Note :</u> Probably the most difficult violation to find and demonstrate by test, because if you do your tests right you respect the SRP... So sorry for the really bad code here, but it is the point.

### Open Closed Principle (OCP)

> You class should be open for extension but close for modification

The example here is inspired from the book *"Agile Software Development : Principles, Patterns and Practices"* of Robert C. Martin.

No Idea how to materialize this violation through tests. 
But you can look at the [**ShapeDrawer**](src/main/java/net/bakaar/solidviolation/ocp/ShapeDrawer.java) and his method **drawAllShapes()**.
It is not possible to add a new shape without modifying this method.

### Liskov Substition Principle (LSP)

> Subtypes must be substitutable for their base types

See [**LSPViolationTest**](src/test/java/net/bakaar/solidviolation/lsp/LSPViolationTest.java) for details

### Interface Segregation Principle (ISP)

> Clients should not be forced to depend upon interfaces that they don't use

The example is based on : https://springframework.guru/principles-of-object-oriented-design/interface-segregation-principle/

See [**ISPViolationTest**](src/test/java/net/bakaar/solidviolation/isp/ISPViolationTest.java) for details

### Dependency Inversion Principle (DIP)

> High-level modules should not depend on low-level modules. Both should depend on abstractions.

> Abstractions should not depend on details. Details should depend on abstractions.

