package JavaBasics;

public class ConstructorConcept {

	//constructor is a class entity which is used to define class features while creating the objects in the form of 
	//global variables
	//properties:
	//1.its not a function and can't return a value
	//2.name should be same as classname
	//3.no static 
	//constructor can be overloaded
	public ConstructorConcept(){
		System.out.println("Default constructor");
	}
	
	public ConstructorConcept(int i){
		System.out.println("single parameter constructor");
		System.out.println("the value of i "+i);
	}
	public ConstructorConcept(int i,int j){
		System.out.println("two parameters constructor");
		System.out.println("the value of i "+i);
		System.out.println("the value of j "+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorConcept con = new ConstructorConcept();
		ConstructorConcept con1 = new ConstructorConcept(10);
		ConstructorConcept con2 = new ConstructorConcept(10,20);
	}

}
