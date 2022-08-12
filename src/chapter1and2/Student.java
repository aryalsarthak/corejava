package chapter1and2;

public class Student {
	
	 int id;
	    String name;
	    int age;
	    public Student(int id,String name,int age){
	        this.age=age;
	        this.id=id;
	        this.name=name;
	    }
	    public String toString(){
	        return "name="+this.name + "id="+this.id + "age="+this.age ;
	    }
	    public static void main(String [] args){
	        Student e=new Student(2,"ram", 12);
	        System.out.println(e);

	    }

}
