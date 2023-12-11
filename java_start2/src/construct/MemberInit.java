package construct;

public class MemberInit {
	String name;
	int age;
	int grade;
	
	void initMember(String name, int age, int grade) {
		this.name = name; //내 인스턴스를 가리키고 싶을 때
		this.age = age;
		this.grade = grade;
	}
}
