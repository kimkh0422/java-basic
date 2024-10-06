package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("학생1",15,90);
        MemberConstruct member2 = new MemberConstruct("학생2",16);

        MemberConstruct[] members = {member1,member2};

        for (MemberConstruct s : members) {
            System.out.println("이름:"+s.name+" 나이:"+s.grade+"성적"+s.grade);
        }
    }


}
