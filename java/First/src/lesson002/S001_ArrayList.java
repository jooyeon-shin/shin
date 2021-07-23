package lesson002;

public class S001_ArrayList {

	public static void main(String[] args) {
		package lesson002;

		public class S002_ArrayList {

			public static void main(String[] args) {
				MemberArrayList memberArrayList = new MemberArrayList();
				Member memberLee = new Member(1001, "이지원");
				Member memberSon = new Member(1002, "손민국");
				Member memberPark = new Member(1003, "박서훤");
				Member memberHong = new Member(1001, "홍길동");

				memberArrayList.addMember(memberLee);
				memberArrayList.addMember(memberSon);
				memberArrayList.addMember(memberPark);
				memberArrayList.addMember(memberHong);

				memberArrayList.showAllMember();

				memberArrayList.removeMember(memberHong.getMemberID());
				memberArrayList.showAllMember();

			}

		}
	}
}