package xuanke;

public class Text {
	public static void main(String args[]){

		Student stu1 = new Student("101","小明","男","工程制图CAD");
		Teacher tea1 = new Teacher("201","郝老师","女","经济学基础");
		Course cou1 = new Course("1","经济学基础","教307","第三四大节","郝老师");
		People peo1 = new People("101","小明","男");
		
		System.out.println(stu1.toString());
		System.out.println(tea1.toString());
		System.out.println(peo1.toString());
		System.out.println(cou1.toString());
	}
}
