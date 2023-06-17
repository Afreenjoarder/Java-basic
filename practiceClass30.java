package com;
class student{
	int rno;
	String name;
	int TotalMarks;
	

/*public void insertStudent(int rno1,String name,int TotalMarks) {
	rno=rno1;
	this.name=name;
	this.TotalMarks=TotalMarks;
	
}*/
public void show() {
	System.out.println(rno);
	System.out.println(name);
	System.out.println(TotalMarks);
	
	}


}


public class practiceClass30 {

	public static void main(String[] args) {
		
		student s=new student();
		s.rno=1;
		s.name="Adifa";
		s.TotalMarks=670;
		s.show();
	}

}
