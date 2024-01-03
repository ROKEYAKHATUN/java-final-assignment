package dev.service;

import dev.domain.User;
import dev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User user) {
        userRepository.create(user);
    }

    public void editUser(User user) {
        userRepository.edit(user);
    }

    public void deleteUser(int id) {
        userRepository.delete(id);
    }

    public List<User> getAllUsers() {
        return userRepository.getAll();
    }

    public User getUser(int id) {
        return userRepository.get(id);
    }

    public String getFullNameByUsername(String username) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        return userOptional.map(User::getFullName).orElse(null);
    }

    public boolean authenticateUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password) != null;
    }
}
