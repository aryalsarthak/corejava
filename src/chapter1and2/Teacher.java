package chapter1and2;

public class Teacher extends Employee{
	int noc;

	public Teacher(String name, int id, int mSalary,int noc) {
		super(name, id, mSalary);
		this.noc=noc;
	}
	 public int ysalary(){
         return  super.ysalary()+noc*100;
       }
	  public String toString(){
		    return "name="+this.name + "id="+this.id + "ySalary="+this.ysalary() + "noc="+this.noc;
		  }
     public static void main(String [] args){
       Employee E=new Employee ("ram",12,12000);
       Teacher T=new Teacher("hari",1233,123000,12);
       System.out.println(E);
       System.out.println(T);
   
   
     }

}
