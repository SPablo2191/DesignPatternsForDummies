# DesignPatternsForDummies
## Source:
[Refactor Guru](https://refactoring.guru/design-patterns)
## What is a Pattern Design?
- pre-made blueprints that you can apply in order to solver design problem in your code.
- it is not a "ctrl+c ctrl+v" type of solution
- the pattern is a concept for solving a particular problem.
- it is not algorithm => this one is like a cooking recipe (step by step)
- meanwhile, PD is like a blue print => this beautiful tool helps you in a high level description of a solution (you apply the idea in base of this)
- typical solutions to common problems in object-oriented design.
- toolkit of tried and tested solutions to common problems.

## Classification of patterns
- creational:
    - object creation mechanisms => allow to reuse the code
- structural:
    - assemble objectsd and classes into larger structures 
- behavioral:
    - effective communication between objects.

## Creational
### Abstract Factory:
- Summarize: An strategy use when you have something that in essence is the same, but  have some unique attributes (each one of the factory has their way of doing things); works fine with group of things. Maybe useful in base services. 
```C#
    Console.WriteLine("Client: Testing client code with the first factory type...");
    IFurnitureFactory furnitureFactory = new ModernFactory();
    IChair newChair = furnitureFactory.CreateChair();
    newChair.SitOn();
    Console.WriteLine("Client: Testing client code with the second factory type...");
    furnitureFactory = new VictorianFactory();
    newChair = furnitureFactory.CreateChair();
    newChair.SitOn();
```
