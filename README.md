# JavaPractice

 **Q1. HelloWorld.java의 줄3을 다음과 같이 수정하면 컴파일 에러가 발생한다. 
public class Helloworld { 
컴파일 에러 메시지는 무엇인지 확인하라. 에러가 발생하는 원인은 무엇인가?**


    public class HelloWorld 가 소스코드 내에 반드시 선언되어야 함.
    public class는 소스코드내에 한개만 존재할 수있으며 그 클래스의 이름은 소스코드 이름과 같아야한다.

 **Q2.줄11을 다음과 같이 수정하면 컴파일 에러가 발생한다. 
	public class GoodMorning { 
	컴파일 에러 메시지는 무엇인지 확인하라. 에러가 발생하는 원인은 무엇인가?**


	소스코드내에 public class는 한개만 존재해야함 

**Q3. 줄1을 다음과 같이 수정하면 컴파일 에러가 발생한다. 
package Hello; 
컴파일 에러 메시지는 무엇인지 확인하라. 에러가 발생하는 원인은 무엇인가?**

	HelloWorld.java 는 JavaPractice 폴더안에 존재하니 
		HelloWorld 클래스도 package JavaPractice에 선언 되어 있어야함.

**Q4. Object 타입의 변수에 String 객체를 대입해도 되고,  
Date 객체, StringBuilder 객체, Integer 객체를 대입해도 되는 이유는 무엇인가?**

	java에서는 부모클래스 참조변수에 자식 클래스 객체를 참조하는 것이 가능하다. 
	up casting이라고 부른다. Object 클래스는 모든 클래스의 부모클래스이므로 가능하다.
	
**Q5. Object 타입의 변수에, int 배열이나 String 배열을 대입해도 되는 이유는 무엇인가?**
	
	java에서 배열은 어딘가에 정의되어 있는 이름 모를 클래스의 객체이다. 때문에 부모클래스인 
	Object 타입의 변수에 대입할 수 있다.
	
**Q6. Object 타입의 변수에, int 값이나 double 값을 대입해도 되는 이유는 무엇인가?**
	
        기본자료형을 참조변수에 대입을 하면 auto boxing이 일어나 wrapper 클래스로 변환이 되어 객체가
        대입이 된다.



	
