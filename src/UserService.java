public class UserService {

    DA0 dao = new DA0();

    public void join(User user) {
        dao.addUser(user);
        System.out.println(user.getName() + "님 가입을 환영합니다");
    }

    public boolean check(User user) {
        User LoginUser = dao.getUserId(user.getId());
        if (LoginUser != null && LoginUser.getPw().equals(user.getPw())) {
            return true;
        } else {
            return false;
        }

    }

    public void updateUser(String id, String newId, String newPw, String newName) {
        User user = dao.getUserId(id);
        if (user != null) {
            user.setId(newId);
            user.setPw(newPw);
            user.setName(newName);
            System.out.println("회원정보가 수정되었습니다");
        } else {
            System.out.println("잘못 입력하셨습니다");
        }
    }

    public void deleteUser(String id) {
        User user = dao.getUserId(id);
        if (user != null){
            dao.removeUser(id);
            System.out.println("회원정보가 삭제되었습니다");
        }else{
            System.out.println("잘못 입력했습니다");
        }
    }
}
