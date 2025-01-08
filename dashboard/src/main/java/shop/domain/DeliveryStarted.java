package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shop.infra.AbstractEvent;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String productId;
    private String address;
    private Integer qty;
}
