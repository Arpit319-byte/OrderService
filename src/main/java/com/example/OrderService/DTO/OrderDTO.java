package com.example.OrderService.DTO;

import lombok.*;

import java.util.ArrayList;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDTO {

    private long orderId;
    private ArrayList<OrderItemDTO> orderItemsList;
}
