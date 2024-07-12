package com.example.demo.service.serviceImpl;


import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@AllArgsConstructor
@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public User createUser(User user) {
        return mongoTemplate.save(user);
    }

    @Override
    public User getUserById(Integer userId) {
       Optional<User> optionalUser = Optional.ofNullable(mongoTemplate.findById(userId, User.class));
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return mongoTemplate.findAll(User.class);
    }

    @Override
    public User updateUser(User user) {
        /*User existingUser = mongoTemplate.findById(user.getId(), User.class);
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        return existingUser;*/
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {
        mongoTemplate.remove(userId);
    }
}

