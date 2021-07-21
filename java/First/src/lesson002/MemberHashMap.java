package lesson002;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, Member> HashMap;

	public MemberHashMap() {
		HashMap = new HashMap<Integer, Member>();
	}//end of constructor

	public void addMember(Member member) {
		HashMap.put(member.getMemberID(), member);
	}

	public boolean removeMember(int memberId) {
		if(HashMap.containsKey(memberId)) {
			HashMap.remove(memberId);
			return true;
		}

		System.out.println(memberId + "가 없습니다.");
		return false;
	}

	public void showAllMember() {
		Iterator<Integer> ir = HashMap.keySet().iterator();



	}
}
