# solid-violations-examples
A set of code examples violating SOLID Principles

## Definitions

### Single Responsability Principle (SRP)

> A class should have ony one reason to change

The example here is inspired from the book *"Agile Software Development : Principles, Patterns and Practices"* of Robert C. Martin.

Suppose we have an [**Employee** class](/src/main/java/net/bakaar/solidviolation/srp/Employee.java) that it has two methods :

![Employee class](/doc/images/EmployeeExampleSRP.png)

See [**SRPViolationTest**](src/test/java/net/bakaar/solidviolation/srp/SRPViolationTest.java) for details

<u>Note :</u> Probably the most difficult violation to find and demonstrate by test, because if you do your tests right you respect the SRP... So sorry for the really bad code here, but it is the point.

### Liskov Substition Principle (LSP)

> Subtypes must be substitutable for their base types

See [**LSPViolationTest**](src/test/java/net/bakaar/solidviolation/lsp/LSPViolationTest.java) for details