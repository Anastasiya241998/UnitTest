import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Login");
        String login = scanner.nextLine();
        System.out.println("Password");
        String password = scanner.nextLine();

        User user = getLoginAndPassword(login, password);
        validateUser(user);
    }

    public static User[] getUsers() {
        User user1 = new User("john", "jhon@gmail.com", "pass", 24);
        User user2 = new User("john2", "jhon2@gmail.com", "pass2", 27);
        User user3 = new User("john3", "john3@gmail.com", "pass4", 16);

        return new User[]{user1, user2, user3};
    }


    public static User getLoginAndPassword(String password, String login) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }


    public static void validateUser (User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Вам нет 18 лет. Доступ запрещён.");
        } else {
            System.out.println("Доступ разрешён.");
        }
    }
}