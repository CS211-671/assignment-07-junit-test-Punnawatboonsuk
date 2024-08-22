package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userlist = new UserList();

        userlist.addUser("pun","lol555");
        userlist.addUser("auto","bruh");
        userlist.addUser("jr","froster");



        // TODO: find one of them
        User target = userlist.findUserByUsername("pun");

        // TODO: assert that UserList found User
         String expected = "pun";
         String actual = target.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userlist = new UserList();

        userlist.addUser("pun","lol555");
        userlist.addUser("auto","bruh");
        userlist.addUser("jr","froster");
        // TODO: change password of one user
        // TODO: assert that user can change password
        boolean expected = true;
        boolean actual =  userlist.changePassword("auto","bruh","haha");
        assertEquals(expected,actual);


    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userlist = new UserList();

        userlist.addUser("pun","lol555");
        userlist.addUser("auto","bruh");
        userlist.addUser("jr","froster");
        // TODO: call login() with correct username and password
        User target = userlist.login("jr","froster");
        // TODO: assert that User object is found

        User actual = target;
        assertNotNull(actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userlist = new UserList();

        userlist.addUser("pun","lol555");
        userlist.addUser("auto","bruh");
        userlist.addUser("jr","froster");

        // TODO: call login() with incorrect username or incorrect password
        User target = userlist.login("net","bluh");

        User actual = target;
        assertNull(actual);
    }

}