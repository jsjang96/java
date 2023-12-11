package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;
	
	
	//생성자 추가 (생성자 오버로딩)
	MemberConstruct(String name, int age){
		this(name, age, 50); //이 형태를 아래에 있는 생성자에 전달.
		//생성자는 첫 줄에만 작성 가능하다.
//		this.name = name;
//		this.age = age;
//		this.grade = 50;
	}
	
	//생성자
	//생성자 이름은 class이름과 같게 써야함. => 규칙임
	MemberConstruct(String name, int age, int grade){
		System.out.println("생성자 호출 name= "+name + ",age="+age+",grade=" + grade);
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
