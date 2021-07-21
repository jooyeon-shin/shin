package lesson002;

public class Member {
private int memberID; // 회원 아이디
private String memberName; // 회원 이름

// 생성자 construcor
public Member(int memberID, String memberName ) {
	this.memberID = memberID;
	this.memberName = memberName;

}

// getters & setters
public int getMemberID() {
	return memberID;
}

public void setMemberID(int memberID) {
	this.memberID = memberID;
}

public String getMemberName() {
	return memberName;
}

public void setMemberName(String memberName) {
	this.memberName = memberName;
}// end of main

@Override
public String toString() {
	// TODO Auto-generated method stub
	return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
}



}// end of class

