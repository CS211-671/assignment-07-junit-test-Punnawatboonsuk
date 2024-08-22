package ku.cs.models;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> users;

    public UserList() {
        users = new ArrayList<>();
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.isUsername(username)) {
                return user;
            }
        }
        return null;
    }

    public void addUser(String username, String password) {
        User exist = findUserByUsername(username);
        if (exist == null) {
            users.add(new User(username, password));
        }
    }


    //TODO: implements this method to change user's password to newPassword by verified oldPassword
    //TODO: return true if process is completed, otherwise return false
    public boolean changePassword(String username, String oldPassword, String newPassword) {
        if (users.contains(findUserByUsername(username))) {
            User target = findUserByUsername(username);
            if (target.validatePassword(oldPassword)) {
                target.setPassword(newPassword);
                return true;
            }
        }
        return false;
    }

    //TODO: implements this method to find user in users with valid password
    //TODO: return User object if username and password is correct, otherwise return null
    public User login(String username, String password) {
        if (users.contains(findUserByUsername(username))) {
            if (users.get(users.indexOf(findUserByUsername(username))).validatePassword(password)) {
                return findUserByUsername(username);
            }
            else {return null;}

        }
        else {return null;}

    }
}