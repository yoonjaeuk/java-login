import com.sun.source.util.SourcePositions;

public class Person {
    private String name;
    private int age;

    Person(int age) {
        this.age = age;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public void setName(String n){
//        name = n;
//    }
//
//    public void setAge(int a){
//        if(a > 0){
//        age = a;
//        }
//        else{
//            System.out.println("Invalid Age");
//        }
//    }

    public void getIntroduce(){
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다");
    }
}
