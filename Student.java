package xuanke;

public class Student {
	public String id;
	public String name;
	public String gender;
	public String study;
	public Student(String id,String name,String gender,String study)
	{
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.study = study;
	}
	public String toString() {
		return " 学生编号: "+this.id+" 姓名: "+this.name+" 性别: "+this.sex+" 所选课程:"+this.study;
	}
}
