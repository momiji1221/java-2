package xuanke;

public class Course {
	public String id;
	public String name;
	public String place;
	public String time;
	public String tname;
	public Course(String id,String name,String place,String time,String tname)
	{
		this.id = id;
		this.name = name;
		this.place = place;
		this.time = time;
		this.tname = tname;
	}
	public String toString() {
		return "课程编号: "+this.id+" 课程名称: "+this.name+" 上课地点: "+this.place+" 上课时间:"
	+this.time+"  授课教师:"+this.tname;
	}
}
