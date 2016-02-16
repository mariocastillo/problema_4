package clases;


public class Student {
    public String name;
    public String carrer;
    public int age;

    public Student(String name, String carrer, int age) {
         this.carrer = carrer;
         this.name = name;
         this.age = age;
    }

    public String getName() {
         return name;
    }
    public void setName(String name) {
	this.name = name;
    }
    public String getCarrer() {
	return carrer;
    }
    public void setCarrer(String carrer) {
	this.carrer = carrer;
    }
    public int getAge() {
	return age;
    }
    public void setAge(int age) {
 	this.age = age;
    }	
    
    void print() 
    { 
        System.out.println(name + " - " +carrer + " - " + age ); 
    }

    
}