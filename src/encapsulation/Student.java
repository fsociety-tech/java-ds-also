package encapsulation;

public class Student {

 private String name;
 private int age;

 public int getAge()
 {
	 return age;
 }
 
 public void setAge(int age)
 {
	 if(age>20 && age<30)
	 {
		 this.age = age; 
	 }
	 else
	 {
		 System.out.println("age is not valid");
	 }
	 
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
