package chapter1and2;

public class Employee {
	
	String name;
	 int id,mSalary;
	  
	  public Employee(String name,int id,int mSalary){
	    this.name=name;
	    this.id=id;
	    this.mSalary=mSalary;
	  }
	  public int ysalary(){
	    return mSalary*12;
	  }
	  public String toString(){
		    return "name="+this.name + "id="+this.id + "ySalary="+this.ysalary();
		  }

}
