//필드
//생성자
//메소드 순으로

public class Phone {
    protected String brand;

    Phone(String brand) {
        this.brand = brand;
    }
    public void printLogo(){
        System.out.println("***" + brand + "***");
    }

    public void turnOn(){
        printLogo();  //메소드는 코드에 확신을 준다(메소드는 가능한 추출해야한다)
        System.out.println("핸드폰이 켜집니다");
    }
    public void turnOff(){
        System.out.println("핸드폰이 꺼집니다");
    }


}
