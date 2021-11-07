package Practice;

public class Member {
	private String name,id,pwd,phone;
	Member() {}
	Member(String name,String id,String pwd,String phone){
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
	}
	
	void prt(){
		System.out.printf("이름: %s\n번호: %s\n",name,phone);
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}

}
