import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void main() {
    }

    @Test
    void getUsersTest() {
        User user1 = new User("john", "jhon@gmail.com", "pass", 24);
        User user2 = new User("john2", "jhon2@gmail.com", "pass2", 27);
        User user3 = new User("john3", "john3@gmail.com", "pass4", 16);

        User[] users = {user1, user2, user3};
        User[] actual = Main.getUsers();
        Assertions.assertEquals(users.length, actual.length);

    }


    @Test
    void getLoginAndPassword() {


    }

    @Test
    void validateUser() throws AccessDeniedException {
        User user1 = new User("john", "jhon@gmail.com", "pass", 24);

        Assertions.assertThrows(AccessDeniedException.class, () ->{
            Main.validateUser(user1);
        });
        Assertions.assertEquals("Доступ разрешён.", AccessDeniedException.getMessage());


    }
}
