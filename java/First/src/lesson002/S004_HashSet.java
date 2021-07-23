package lesson002;

import java.util.HashSet;
import java.util.Iterator;

public class S004_HashSet {

	public static void main(String[] args) {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
	hashSet = new HashSet<member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int MemberId) {
		Iterator<Member> ir= hashSet.iterator();
		
		while(ir.hashNext()) {
			Member member = ir.next();
			int tempId = member.getMemberID();
			if(tempId == memberId) {
				hsshSet.remove(member);
				return true;
			}
		}
	System.out.println(memberId + "가 존재하지 않습니다.");
	return false;
	}

	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);		
		}
		System.out.println();
	}
	}//main

}//class
