package chapter1and2;

 public  class Football extends Athelete {
	 int nog;
	private String name;

	public Football(String name, int age,int nog) {
		super(name, age);
		this.nog=nog;
	}
	
	public String toString() {
		return "name="+this.name + "age="+this.age + "nog"+this.nog;
	}
	@Override
	public void showStat() {
		// TODO Auto-generated method stub
		System.out.println(this.nog);
	}
	
	
	

}
