package class1;

public class ClassStart5 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "학생1"; //클래스는 . 을 통해서 접근할 수 있음.
		student1.age = 15;
		student1.grade = 90;
		
		Student student2 = new Student();
		student2.name ="학생2";
		student2.age = 20;
		student2.grade = 99;
		
//		Student[] students = new Students[] {student1, student2}; 
		Student[] students = {student1, student2};
		
		for(int i=0; i<students.length; i++) {
		System.out.println("이름: "+ students[i].name + " 나이:" + students[i].age + " 성적: "+ students[i].grade);
		}
		for(int i=0; i<students.length; i++) {
			Student s = students[i];
			System.out.println("이름: "+ s.name + " 나이:" + s.age + " 성적: "+ s.grade);
		}
		//향상된 for문
		for(Student s : students) {
			System.out.println("이름: "+ s.name + " 나이:" + s.age + " 성적: "+ s.grade);
		}
	}
}
