# Design-pattern-Adapter-Factory-Command-Memento
Design pattern with Adapter&amp;Factory&amp;Command&amp;Memento in Java

GoodHealth Fitness Corporation is a large fitness club.  It provides state-of-the-art equipment to its members to use.  The company maintains a membership system for recording members’ information and prepaid hours for using the club’s facilities.  Recently, GoodHealth plans to acquire GreenFitness Limited which is a small fitness club.  After the acquisition, GrantFitness Corporation is established to manage the business operation of GoodHealth Fitness Corporation and GreenFitness Limited.

GoodHealth uses a class called “MemberCare” to manage the member records.  The system has the following basic methods to support the daily operations.

1.	createMember ( ) to create a Member object with zero prepaid hours

2.	searchMember ( ) to search a Member object by id

3.	remove ( ) to remove a Member object by id

4.	changePhoneNumber ( ) to update the phone number of a Member object

5.	addPrepaidHours ( ) to add the given hours to a Member object

6.	usePrepaidHours ( ) to deduct the given hours from a Member object


GreenFitness uses a class called “ClientControl” to manage the client records.  The system has the following basic methods to support the daily operations.

1.	createClient ( ) to create a Client object with zero remaining hours

2.	findClient ( ) to search a Client object by cid

3.	deleteClient ( ) to remove a Client object by cid

4.	updateContactNumber() to update the contact phone number of a Client object

5.	addHours ( ) to add the given hours to a Client object

6.	deductHours () to deduct the given hours from a Client object


Adapter pattern to support the operations between the two existing companies and the future integration for any new company acquired by GrantFitness Corporation.

Command pattern to provide the “create member”, “display member detail”, “add hours”, “spend hours”, “change phone number”, “undo”, “redo” and “show undo/redo list” functions 

Factory pattern or Abstract Factory Pattern to create different Command objects and member objects (e.g. Member object, Client object, etc.)

Memento pattern to support “Undo” and “Redo” functions 

# Sample.java is used to run the program

