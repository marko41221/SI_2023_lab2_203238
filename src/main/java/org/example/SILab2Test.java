import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class SILab2Test {

    @Test
    public void testFunctionCriterion1() {

        User user1 = new User("user1", "Password123", "user1@example.com");
        User user2 = new User("user2", "abc123", "user2@example.com");

        List<User> allUsers = new ArrayList<>();
        allUsers.add(user1);

        assertTrue(SILab2.function(user1, allUsers));
        assertFalse(SILab2.function(user2, allUsers));
    }

    @Test
    public void testFunctionCriterion2() {

        User user1 = new User("user1", "Password123", "user1@example.com");
        User user2 = new User("user2", "abc123", "user2@example.com");
        User user3 = new User("user3", "Password123", "user2@example.com");

        List<User> allUsers = new ArrayList<>();
        allUsers.add(user1);
        allUsers.add(user2);

        assertFalse(SILab2.function(user1, allUsers));
        assertTrue(SILab2.function(user2, allUsers));
        assertFalse(SILab2.function(user3, allUsers));
    }

    @Test
    public void testFunctionInvalidEmailFormat() {

        User user = new User("user", "Password123", "invalidemail");

        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionPasswordOnlySpecialCharacters() {

        User user = new User("user", "!@#$%^&*", "user@example.com");

        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionPasswordOnlyWhitespaceCharacters() {

        User user = new User("user", "     ", "user@example.com");

        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionCaseInsensitiveUsernamePasswordMatch() {

        User user = new User("user", "UsErNaMe", "user@example.com");

        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionEmptyPassword() {

        User user = new User("user", "", "user@example.com");

        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test(expected = RuntimeException.class)
    public void testFunctionEmptyEmail() {

        User user = new User("user", "Password123", "");

        List<User> allUsers = new ArrayList<>();

        SILab2.function(user, allUsers);
    }
}
