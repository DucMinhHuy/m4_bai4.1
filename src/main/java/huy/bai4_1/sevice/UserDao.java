package huy.bai4_1.sevice;

import huy.bai4_1.model.Login;
import huy.bai4_1.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users=new ArrayList<>();
        User user1=new User();
        user1.setAge("10");
        user1.setName("huy");
        user1.setAccount("huy");
        user1.setEmail("huy@.com");
        user1.setPassword("huy123");
        users.add(user1);
        User user2=new User();
        user2.setAge("20");
        user2.setName("hung");
        user2.setAccount("hung");
        user2.setEmail("hung@gmail.com");
        user2.setPassword("hung123");
        User user3=new User();
        user3.setAge("30");
        user3.setName("phong");
        user3.setAccount("phong");
        user3.setEmail("phong@gmail.com");
        user3.setPassword("phong123");
    }
    public static User checkLogin(Login login){
        for (User u :
                users) {
            if(u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}

