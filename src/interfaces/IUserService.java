package interfaces;

import models.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    User getUserById(int id);
    void addUser(User user);
    void updateUser(int id, User updateUser);
    void deleteUser(int id);
}
