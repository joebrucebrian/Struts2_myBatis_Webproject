import com.lty.model.User;
import com.lty.service.impl.userServiceImpl;
import com.lty.service.userService;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class testService {
    @Test
    @Ignore
    public void testAdd(){
        User user = new User();
        user.setName("yyy");
        user.setAge(14);
        userService service = new userServiceImpl();
        service.add(user);
    }

    @Test
    @Ignore
    public void testDelete(){
        User user = new User();
        user.setId(4);
        user.setName("wangwu");
        user.setAge(25);
        userService service = new userServiceImpl();
        service.delete(user);
    }

    @Test
    @Ignore
    public void testUpdate(){
        User user = new User();
        user.setId(3);
        user.setName("wangwu");
        user.setAge(28);
        userService service = new userServiceImpl();
        service.update(user);
    }

    @Test
    @Ignore
    public void testselect(){
        userService service = new userServiceImpl();
        User user = service.getUserById(8);
        System.out.println(user);
    }

    @Test
    public void testList(){
        userService service = new userServiceImpl();
        List<User> list = service.getList();
        System.out.println(list);
    }
}
