package com.vaku.foodapp.auth_users.entity;

import com.vaku.foodapp.cart.entity.Cart;
import com.vaku.foodapp.order.entity.Order;
import com.vaku.foodapp.payment.entity.Payment;
import com.vaku.foodapp.review.entity.Review;
import com.vaku.foodapp.role.entity.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    @NotBlank(message = "password is required")
    private String password;

    private String phoneNumber;

    private String profileUrl;

    private boolean isActive;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Review> reviews;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Payment> payments;

    @OneToOne(mappedBy = "user" , cascade = CascadeType.ALL)
    private Cart cart;

    private LocalDateTime createdAt;
    private String address;
    private LocalDateTime updatedAt;

}
