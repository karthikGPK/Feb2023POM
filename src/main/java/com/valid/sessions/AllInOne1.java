package com.valid.sessions;

public class AllInOne1 {
	
	
	int a ;
	static int b = 500;
	String data ="first value";
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		AllInOne1.b = b;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
	public AllInOne1() {
		this(100);
		System.out.println("Default Cons");
	}
	public AllInOne1(int a) {
		System.out.println("Param cons");
	}

	public static void main(String[] args) {
		AllInOne1 a = new AllInOne1();
		
		

	}
	
	// DataType - Primitive and Non-Primitive
	// DataType Range problems
	//Increment and Decrement operator
	//Metods -- Static and Non static Metods
	// Static Metod - CMA/Metaspace
	//eap memory and Stack Memeory
	//Varaible - Globla varaible / Class varaible / Local varaible / 
	// Local variable - cannot be static and assign local variable first itself
	//Encapsulation - Getters, setters, Generate Getters and setters
	//Polymorpism - Static poly and Dynamic poly
	//Static polymorpis--- Overloading
	//Dynanmic poly -- overriding
	// Overloading -- same m name,diff parameters, diff parameters seq, Void and return not matter
	//Overriding - Extends , same name, different class, void and return matters
	//OOPS - Ineitance, Ploymorism, Encapsulation, 
	// Class to class - Extends
	// Interface to Interface - Extends
	// Interface to Class - implements
	// Interface -- parent -- Interface
	//interface --No object, No constructor, variables are static and final in nature, after jdk 1.8 metod body and default, No static and Final in m
	// abstract class - abastract keyword in class and m level, Constructor allowed, No Object creation
	// class -- cild -- constructor allways give preference to parent constructor
	//String -- M
	// String constant pool
	// Garbage collector
	// Obj wit ref and obj w/o ref and obj wit null refer and only reference 
	//eap memory 
	// stack memory - LIFO last in first out -- stack overflow error
	//Array -- class
	// ArrayList -- Class
	// List -- Interfce
	// Metod wit return -- only one return at a time
	//

}
