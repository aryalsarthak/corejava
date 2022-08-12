package chapter1and2;

 public class  Cricket extends Athelete {
	int run;

	public Cricket(String name, int age,int run) {
		super(name, age);
		this.run=run;
	}
	public void showStat() {
		System.out.println(this.run);
	}
	public String tostring() {
		return "name="+this.name + "age="+this.age + "run="+this.run;
	}
	public static void main(String [] args) {
		Football f=new Football("ram",23,22);
		Cricket c=new Cricket("hari",24,222);
		System.out.println(f.toString());
		System.out.println(c.toString());
	}

}
