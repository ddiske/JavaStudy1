package com.root.app.study2.object2;

public class SchoolMateView {
	
	//view
	//학생정보를 출력하는 메서드
	
	public void view(SchoolMate schoolMate) {
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		
		
		System.out.print(schoolMate.name+"\t");
		System.out.print(schoolMate.num+"\t");
		System.out.print(schoolMate.kor+"\t");
		System.out.print(schoolMate.eng+"\t");
		System.out.print(schoolMate.math+"\t");
		System.out.print(schoolMate.total+"\t");
		System.out.print(schoolMate.avg+"\n");
		

	}
		

}
