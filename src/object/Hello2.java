package object;

class Hello2 {} 
// 하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직
// 소스파일 이름은 public class의 이름과 일치 
// 하나의 소스파일에 public class는 하나만 작성
// class는 여러개 작성 가능
class hello3{}
class hello4{
	public static void main(String[] args) {
		System.out.println("hello");  //클래스이름이 달라서 실행x
	}
} 

//클래스 이름이 달라서 실행이 안될때 직접 지정해주는 방법도 있나
//run configuration 에서 직접 지정하면 실행가능.

