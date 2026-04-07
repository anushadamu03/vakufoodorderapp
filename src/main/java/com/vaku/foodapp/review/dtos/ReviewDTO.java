package com.vaku.foodapp.review.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.vaku.foodapp.auth_users.entity.User;
import com.vaku.foodapp.menu.entity.Menu;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewDTO {

    private Long id;

    @NotNull(message = "Rating is Required")
    @Min(1)
    @Max(10)
    private Integer rating;

    @Size(max = 500, message = "comment cannot exceed 500 characters")
    private String comment;

    private String menuName;

    private LocalDateTime createdAt;

    private Long orderId;

    private Long menuId;

    private String userName;




}
