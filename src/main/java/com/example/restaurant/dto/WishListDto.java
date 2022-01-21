package com.example.restaurant.dto;

import com.example.restaurant.entity.MemoryDbEntity;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WishListDto {

    private int index;

    private String title;

    private String category;

    private String address;

    private String roadAddress;

    private String homePageLink;

    private String imageLink;

    private boolean isVisit;

    private int visitCount;

    private LocalDateTime lastVisitDate;
}
