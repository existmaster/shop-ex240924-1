package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private String orderid;
    private String customerid;
    private String productid;
    private String address;
    private Integer qty;
}
