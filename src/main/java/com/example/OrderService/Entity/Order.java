package com.example.OrderService.Entity;


import com.example.OrderService.Enums.OrderStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.*;

import javax.management.ListenerNotFoundException;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order extends BaseEntity{

    private long userId;
    private OrderStatus orderStatus;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> items;
}
