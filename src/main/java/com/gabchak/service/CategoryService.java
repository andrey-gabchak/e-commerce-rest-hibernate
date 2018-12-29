package com.gabchak.service;

import com.gabchak.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    void save(Category category);

    void update(Category category);

    Optional<Category> findByName(String name);

    Optional<List<Category>> findAll();

    Optional<Category> findByNameAndListProducts(String name);

    void deleteByName(String name);
}
