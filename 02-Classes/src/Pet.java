// An interface is a completely "abstract class" 
// that is used to group related methods with empty bodies: 
// It can be a way around for multiple inheritance. A class can implement multiple interfaces

public interface Pet {
	
	// all variables in an interface are implicitly public, static, and final
	int a = 10;
	
	// methods are by default public and abstract
	void walk(); // interfaces have functions with no body
	void play(); // interfaces have functions with no body
}

