package lesson002;

import java.util.HashSet;
import java.util.Iterator;

public class S004_HashSet {
	
	private HashSet<Member> hashSet; 
	
	public void MemberHashSet() {
		hashSet = new HashSet<Member>();
	}

	public void addMember(Member member) {
		hashSet.add(member);
	}

	public boolean removeMember(int MemberId) {
		Iterator<Member> ir= hashSet.iterator();

		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberID();
			if(tempId == MemberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(MemberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);		
		}
		System.out.println();
	}
}//class
