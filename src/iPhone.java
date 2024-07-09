public class iPhone extends Phone {
    private int number;
    iPhone(String brand, int number){
        super(brand); // 부모 클래스의 생성자 호출
        this.number = number;
    }


    public void call(){
        System.out.println("~~~~~" + number);
    }

    @Override
    public void printLogo(){
        super.printLogo(); // 부모 객체의 prinLogo를 출력한다

    }
}
