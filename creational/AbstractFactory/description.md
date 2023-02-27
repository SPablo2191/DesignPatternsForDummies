# Abstract Factory:
![alt text](https://refactoring.guru/images/patterns/content/abstract-factory/abstract-factory-comic-2-en-2x.png)
- This solution can be used when you confront a matricial structure of objects, for example: for a class chair it could be 3 instance of it, but each chair also are part of a category:
![](https://refactoring.guru/images/patterns/diagrams/abstract-factory/problem-es-2x.png?id=4f3f5d6a7df37e814cfca21fc47fb186)

- but, where is the problem? for example: if you sold a combo (chair + sofa + table) it could happen that you have a mix between different variants of the object which is not what a user expect. having 3 differents families of objects and growing could be danger for our code.
- this method propose that you use interface for each class of family object (deco chair or victorian chair implements chair) and the factory (class instanced that creates new instance of objects such as victorianFurnitureFactory  which creats victorian chair sofas and tables also implements a factory)
- so in the main there is only one interface factory which will change when you need an specific family.