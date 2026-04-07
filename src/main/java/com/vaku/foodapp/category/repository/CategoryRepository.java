package com.vaku.foodapp.category.repository;

import com.vaku.foodapp.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
