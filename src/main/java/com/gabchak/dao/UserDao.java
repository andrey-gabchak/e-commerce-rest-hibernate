package com.gabchak.dao;

import com.gabchak.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    void addUser(User user);

    Optional<User> findByEmail(String email);

    User update(User user);

    User findById(Long id);

    User findByToken(String token);

    List<User> findAll();

    void deleteById(Long id);

    void deleteByEmail(String email);
}
