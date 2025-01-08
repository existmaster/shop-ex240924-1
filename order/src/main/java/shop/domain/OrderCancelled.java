package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String productid;
    private String customerid;
    private Integer qty;

    public OrderCancelled(Order aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
