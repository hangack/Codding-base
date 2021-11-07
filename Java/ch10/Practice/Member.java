package Practice;

abstract class Member implements Tesk {
	private String name,id,pwd,position;
	
	Member(){}
	
	Member(String name,String id,String pwd,String position) {
		this.name = name;	this.id = id;	this.pwd = pwd;	this.position = position;
	}

	public abstract void work();
	public abstract void test();
	
}
