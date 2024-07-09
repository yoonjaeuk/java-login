//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {  //static = 컴파일 시점에 메모리에 올라감  //public 모든 코드에서 접근이 가능함
        int userInput;
        String signup;
        User user = null;
        UserService us = new UserService();
        Scanner sc = new Scanner(System.in);


        while (true) {

        System.out.println("1. 회원가입 / 2. 로그인 / 3. 회원정보 수정 / 4. 탈퇴 / 0. 종료");
            userInput = Integer.parseInt(sc.nextLine());
            if (userInput == 0) {
                break;
            }

            if (userInput == 1) {
                System.out.println("가입하실 아이디, 비밀번호, 이름을 입력하세요 띄어쓰기로 구분");
                //Scanner sc1 = new Scanner(System.in);
                signup = sc.nextLine();

                String[] mod = signup.split(" ");
                String ret1 = mod[0];
                String ret2 = mod[1];
                String ret3 = mod[2];
                System.out.println("아이디 : " + ret1 + "///" + "비밀번호 : " + ret2 + "///" + "이름 : " + ret3 + "///");
                user = new User(ret1, ret2, ret3);
                us.join(user);
            } else if (userInput == 2) {
                System.out.println("로그인할 아이디를 입력하세요");
                String id = sc.nextLine();
                System.out.println("비밀번호를 입력하세요");
                String pw = sc.nextLine();
                user.setId(id);
                user.setPw(pw);
                if (us.check(user)) {
                    System.out.println(user.getName() + "로그인 성공");
                } else {
                    System.out.println("로그인 실패: 아이디 또는 비밀번호가 일치하지 않습니다");
                }
            } else if (userInput == 3) {
                System.out.println("원래 아이디를 입력하세요");
                String id = sc.nextLine();
                System.out.println("수정하고 싶은 아이디를 입력하세요");
                String newId = sc.nextLine();
                System.out.println("수정하고 싶은 비밀번호를 입력하세요");
                String newPw = sc.nextLine();
                System.out.println("수정하고 싶은 이름를 입력하세요");
                String newName = sc.nextLine();
                us.updateUser(id, newId, newPw, newName);

            } else if (userInput == 4) {
                System.out.println("탈퇴하고 싶은 아이디를 입력하세요");
                String id = sc.nextLine();
                us.deleteUser(id);

            }

        }
    }
    }