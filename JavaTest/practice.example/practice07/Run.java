package practice07;

public class Run {

	public static void main(String[] args) {
		/*
		 * [메소드 실습예제]
		 * 기본 생성자로 객체를 만들고 Setter를 이용해 값 변경 후,
		 * Getter를 이용해 출력
		 */
		
		Employee e = new Employee(1, "신형만");
		
		e.setDept("영업과");
		e.setJob("과장");
		e.setAge(35);
		e.setGender('남');
		e.setSalary(250000000);
		e.setBonusPoint(0.5);
		e.setPhone("010-zzang-gu");
		e.setAddress("서울특별시 떡잎마을 카스카베거리");
		
		System.out.println("===== 사원 정보 =====");
		System.out.println("사원 번호 : " + e.getEmpNo());
		System.out.println("사원명 : " + e.getEmpName());
		System.out.println("부서 : " + e.getDept() + " (직책 : " + e.getJob() + ")");
		System.out.println("인적사항 : " + e.getAge() + "세 (" + e.getGender() + ")");
		System.out.println("연봉 : " + e.getSalary() + " (+ " + e.getBonusPoint() + "%)");
		System.out.println("연락처 : " + e.getPhone());
		System.out.println("주소 : " + e.getAddress());
	}

}
