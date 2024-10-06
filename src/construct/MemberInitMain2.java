package construct;

public class MemberInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1,"학생1",16,90);

        MemberInit member2 = new MemberInit();
        initMember(member2,"학생2",15,85);

        MemberInit[] members = {member1,member2};

        for (MemberInit s : members) {
            System.out.println("이름:" +s.name+ " 나이:" +s.age+ " 성적:"+s.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
