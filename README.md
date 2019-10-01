# Facade Pattern
According to GoF Facade design pattern is Provide a unified interface to a set of interfaces in a subsystem.
Facade Pattern defines a higher-level interface that makes the subsytem easier to use.

A Facade not only simplifies an interface, it decouples a client from a subsytem of components.
Facades and Adapters may wrap multiple classes, but a facades's intent is to simplify, while an adapter's is to convert
the interace to something different.

Purpose of this pattern is to make a subsystem easier to use through a simplified interface.

1. Happy client whose job just became easier because of the facade
2. More complex susystem
3. Unified interface that is easier to use

![Facade Pattern](/assets/facade-diagram.png)

## Principle of Least Knowledge
The principle prevents us from creating designs that have a large number of classes coupled together so that changes in one part
of the system cascade to other parts. When you build lot of dependencies between many classes, you are building a fragile system
that will be costly to maintain and complex for others to understand.

purposes of this principle is to reduces the dependencies between objects and reduces software maintenance.
