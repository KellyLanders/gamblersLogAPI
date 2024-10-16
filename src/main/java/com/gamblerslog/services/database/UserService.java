package com.gamblerslog.services.database;

import com.gamblerslog.interfaces.UserRepository;
import com.gamblerslog.models.database.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findUserByName(String name) {
        List<User> users = userRepository.findByName(name);

        return users;
    }

    public List<User> findUserByEmail(String email) {
        List<User> users = userRepository.findByEmail(email);

        return users;
    }
}
