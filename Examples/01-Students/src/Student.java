/*
* In Java, all classes inherit from the class called Object
* Object is the root class of the Java class hierarchy, meaning 
* every class in Java either directly or indirectly inherits from it. 
* If a class doesn't explicitly extend another class, it automatically 
* inherits from `Object`. 
* This provides certain fundamental methods that all Java objects have, such as:

* - toString(): Returns a string representation of the object.
* - equals(Object obj): Checks if two objects are equal.
* - hashCode(): Returns a hash code for the object.
* - clone(): Creates and returns a copy of the object (if the class supports it).
* - finalize(): Called by the garbage collector when the object is being cleaned up.

Object serves as a common ancestor for all Java classes.
*/

public abstract class Student {
    protected int id;
    protected String name;
    protected double tuition;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTuition() {
        return tuition;
    }
    
    public abstract void setTuition();
    
}