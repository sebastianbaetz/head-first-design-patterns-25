Head First Design Patterns (May 2025 - )


Chapter 2: Observer Pattern
* This one is very common, IIRC JS internals use this a lot?
* Subscribers are called OBSERVERS
* Publisher(s) are called SUBJECT(s)
* Like an email list (sure am creative with this example)
* Formal definition: a one-to-many dependency between objects so that when one object changes state, all of its dependants are notified and updated automatically
* A sort-of base for the publish subscribe pattern which is more complex
* Great example of loose coupling - a wonderful thing to work towards
* Implementation detail whether we push or pull data. Observer versus observable. Pull is technically more correct
* Subjects update Observers using a common interface
* Any observer can participate as long as they implement the common interface
* Observers are loosely coupled, the subject knows nothing about them other than that they implement the interface
* DESIGN PRINCIPLE CHALLENGE
  * What varies and what stays the same?
    * State values and the pool of observers
  * Program to an interface, not an implementation
    * That is why we use the Observer, Subject, and DisplayElement interfaces :)
  * Favor composition over inheritance
    * Can compose all observers with their subject. Set at runtime


Chapter 1: Intro, Strategy pattern
* THE BASIS OF DESIGN PATTERNS - Take what varies and encapsulate it so that it won’t affect the rest of your code.
    * Fewer unintended consequences form code changes and more flexibility in your systems
    * You can alter or extend the varied parts without affecting the parts that do not vary
* Program to an interface, not an implementation
* For a Duck class, make a FlyBehavior interface which has two children FlyWithWings and FlyNoWay.
    * Duck classes will not need to know the implementation details of their own behaviors
    * The declared type of the variables should be a super type so that way the objects assigned to those variables can be any concrete implementation of the super type, so the class (Duck) declaring them (FlyBehavior) doesn’t need to know about the actual object types
    * This is like declaring these
    * Dog d = new Dog()
    * Animal a = new Dog()
    * IQuack -> Quack, Squeak, MuteQuack
    * The duck DELEGATES its sucking and flying behavior instead of using defined behaviors
    * Duck is an abstract class
* Duck class diagram exercise
    * Mallard, RedHead, Rubber, Decoy IS-A duck
    * Quack, Squeak, MuteQuack IS-A quack
    * FlyWithWings, FlyNoWay IS-A fly type
    * Duck Fly Behavior HAS-A FlyBehavior type
    * Duck Quack Behavior HAS-A QuackBehavior type
* Favor composition over inheritance
    * HAS-A: when you put two classes together like this you’re using composition. Instead of inheriting their behavior, the ducks get their behavior by being composed with the right behavior object.
    * Composition lets you change behavior at runtime (this is a big one!)
* How would you implement a duck call?
    * Does not make sense to inherit from the duck class. WHY? There is no flying needed for a call. A duck call should HAS-A (sic) QuackBehavior (some ducks have different calls. e.g. Mallard vs Wood Duck) and the QuackBehavior can get extended for different genera and species of ducks.
* This was the strategy pattern. It defines a family of algorithms (quack and fly implementations) that get encapsulated and so they become interchangeable. Strategy lets the algorithm vary independently from clients that use it.
* Design puzzle:
    * Abstract class: WeaponBehavior NO, was the Character
    * Interface: Character NO, was the WeaponBehavior
    * Classes: King, Queen, Knight, Troll, KnifeBehavior, BowAndArrowBehavior, AxeBehavior, SwordBehavior
    * Characters IS-A Character Interface type. The individual weapon behaviors IMPLEMENTS WeaponBehavior. Character interface HAS-A weaponBehavior type
