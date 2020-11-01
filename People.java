package xuanke;

public class People {
	public String id;
	public String name;
	public String gender;
	public People(String id,String name,String gender)
	{
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public String toString() {
		return " 人员编号: "+this.id+" 姓名: "+this.name+" 性别: "+this.sex;
	}
}
