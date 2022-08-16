package private_List_Map;

import java.util.ArrayList;
import java.util.List;

class 카페 {
	private String 메뉴이름; // ex) 아메리카노, 라떼, 녹차 등등
	private int 가격;
	
	public String get메뉴이름() {
		return 메뉴이름;
	}
	public void set메뉴이름(String 메뉴이름) {
		this.메뉴이름 = 메뉴이름;
	}
	public int get가격() {
		return 가격;
	}
	public void set가격(int 가격) {
		this.가격 = 가격;
	}
}
/*
 * 1. 필드변수 getter setter 메소드 생성
 * 2. 에스프레소 3000원, 아메리카노 4000원, 라떼 4500원 객체(클래스) 생성
 * 3. 생성한 객체(클래스) list에 담기
 * 4. list에 있는 모든 원소 출력하기
 * 5. list에 라떼가 있으면 카페모카로 이름 수정
*/
public class List문제 {
	
	public static void main(String[] args) {
		
		카페 c1 = new 카페();
		c1.set메뉴이름("에스프레소");
		c1.set가격(3000);
		
		카페 c2 = new 카페();
		c2.set메뉴이름("아메리카노");
		c2.set가격(4000);
		
		카페 c3 = new 카페();
		c3.set메뉴이름("라떼");
		c3.set가격(4500);
		
		List<카페> list = new ArrayList<카페>();
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		for(카페 cafe : list) {
			System.out.println("메뉴이름 : "+cafe.get메뉴이름()+" / 가격 : "+cafe.get가격()+"원");
		}
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String change = list.get(i).get메뉴이름();
			if("라떼".equals(change)) {
				list.get(i).set메뉴이름("카페모카");
			}
			System.out.println("메뉴이름 : "+list.get(i).get메뉴이름()+" / 가격 : "+list.get(i).get가격()+"원");
		}
		System.out.println();
		
		//list.get(0).get메뉴이름();
		카페 cafe = list.get(0); //0번째 원소 호출
		cafe.get메뉴이름(); // cafe 클래스에 있는 get메뉴이름 메소드 호출
		
		
		
		
	}

}
