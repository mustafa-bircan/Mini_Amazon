package services;

import interfaces.IUserService;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {
    private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();

        users.add(new User(1, "mstfbrcn","m@example.com","password123"));
        users.add(new User(2, "gnctrkcll","g@example.com","password321"));
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void updateUser(int id, User updateUser) {
        User user = getUserById(id);
        if (user != null) {
            user.setUsername(updateUser.getUsername());
            user.setEmail(updateUser.getEmail());
            user.setPassword(updateUser.getPassword());
        }
    }

    @Override
    public void deleteUser(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}
