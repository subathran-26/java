Packages - Classes and interfaces(basically a folder)
OOPS:
Object Oriented Programming
1)Classes
2)Objects - instance of class
*State
*Behaviour
*Identity
-----------------------------------------------------------
Standard Library - inbuilt libraries Ex:util,map

Public final(can't overwrite) class
------------------------------------------------------
OOPS Concept:
1)Class
2)Objects

 Pillars of OOPS:(AEIP)

3)Abstraction
4)Encapsulation
5)Inheritance
6)Polymorphism
--------------------------------------------------
Abstraction:
* Hiding the datas
KEYWORDS:
1)Abstract - Before the class keyword
2)Interface- Instead of class keyword
-----------------------------------------------------
Creating a Abstract class:

package oops;

public class AbstractClass {
	void buySoap() {
		
	}
	void buyPerfume() {
		
	}
}
Abstract class will have only head not the body
ex:abstract void buysoap();
It also support normal methods:
ex:void buyperfume(){
            
}
----------------------------------------------------------
Diff between abstract and normal:

package oops;

public abstract class AbstractClass {
	abstract void buySoap();
	int buyPerfume() {
		int amt=100;
		String name="Park Avenue";
		int productCost=150;
		int balance=amt-productCost;
		return balance;
		
	}
}
-------------------------------------------------------------
Interface will only hold the abstract method

public interface AbstractInterface {
	abstract void buyDress();
}
--------------------------------------------------------------
*Can create a class inside a interface and can create a interface inside a class
----------------------------------------------------------------
Encapsulation:

*wrapping of datas into a single unit
Definition:
It is a concept to wrap the properties and functionality into a single unit

Two Methods:
1)getter
2)setter

Setter:
public void setEmail(String email) {
		this.email=email;
	}
.this - access the propoerties of same class
-------------------------------------------------------------------
Getter:
public String getEmail() {
		return email;
	}
*only want to return the property
------------------------------------------------------------------
Inheritance:
1)parent class
2)child class
KEYWORDS:
1)extends-combines two classes
TYPES:
Single
Multiple-not allowed
Multilevel
Hybrid-not allowed in java
Hierarchical
-----------------------------------------------------------------------------
Polymorphism:
poly(many)morphism(shapes)
Method overriding:One Class,a method can be redefined many times
Method overloading:define muthiple methods with same name but different parameter
