package events;

import com.shashi.dto.OrderRequestDto;
import com.shashi.dto.OrderStatus;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
public class OrderEvent implements  Event{

    private UUID eventId=UUID.randomUUID();
    private Date eventDate=new Date();
    private OrderRequestDto orderRequestDto;
    private OrderStatus orderStatus;

    @Override
    public UUID getEventId() {
        return eventId;
    }

    @Override
    public Date getDate() {
        return eventDate;
    }

    public OrderEvent(OrderRequestDto orderRequestDto, OrderStatus orderStatus) {
        this.orderRequestDto = orderRequestDto;
        this.orderStatus = orderStatus;
    }
}
