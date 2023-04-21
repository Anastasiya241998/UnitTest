import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void userTestPassword(){

        User user = new User("12345", "@mail", "nastya", 18);
        Assertions.assertEquals("12345", user.getPassword());
    }
    @Test
    public  void userTestAge(){
        User user = new User("12345", "@mail", "nastya", 18);
        Assertions.assertEquals(18,user.getAge());



    }

    @Test
    void getEmail() {
        User user = new User("12345", "@mail", "nastya", 18);
        Assertions.assertEquals("@mail",user.getEmail());
    }

    @Test
    void getLogin() {
        User user = new User("12345", "@mail", "nastya", 18);
        Assertions.assertEquals("nastya",user.getLogin());
    }

}
