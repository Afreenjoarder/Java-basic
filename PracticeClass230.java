package com;


class pupil{
	int rno;
	String name;
	int TotalMarks;
	
	public void show() {
		System.out.println(rno);
		System.out.println(name);
		System.out.println(TotalMarks);
		
		}
	public void insertPupil(int rno1,String name,int TotalMarks) {
		rno=rno1;
		this.name=name;
		this.TotalMarks=TotalMarks;
		
	}

}

public class PracticeClass230 {

	public static void main(String[] args) {
		pupil s=new pupil();
		s.insertPupil(12,"Adifa",230);
		s.show();
	}

}

