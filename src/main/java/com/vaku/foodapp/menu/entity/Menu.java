package com.vaku.foodapp.menu.entity;

import com.vaku.foodapp.category.entity.Category;
import com.vaku.foodapp.order.entity.OrderItem;
import com.vaku.foodapp.review.entity.Review;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@Table(name = "menu")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String imageUrl;

    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "menu" , cascade = CascadeType.ALL)
    private List<OrderItem> orderItem;

    @OneToMany(mappedBy = "menu" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;



}
