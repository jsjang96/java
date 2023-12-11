package construct;

public class ConstructMain1 {

	public static void main(String[] args) {
		MemberConstruct member1 = new MemberConstruct("user1", 20, 100); //생성자를 필수로 호출해야함.
		MemberConstruct member2 = new MemberConstruct("user2", 22, 90);
		
		MemberConstruct[] members = {member1, member2};
		
		for(int i =0; i<members.length; i++) {
			System.out.println("이름: "+members[i].name+" 나이: " + members[i].age +" 성적: "+ members[i].grade);
		}
		

	}

}
