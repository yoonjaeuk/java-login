import java.util.HashMap;
import java.util.Map;


public class DA0 { // => Respository - DB랑 얘기하는 애

    private final Map<String, User> db = new HashMap<>();

    private int userCnt = 1;

    public void addUser(User user) {
        // 왼쪽은 타입 오른쪽은 변수명
        db.put(user.getId(), user);
//        for (User value : db.values()) {
//            System.out.println(value.getName());
//        }

    }

    public User getUserId(String id) {
         return db.get(id);
    }


    public void removeUser(String id) {
        db.remove(id);
    }

}

