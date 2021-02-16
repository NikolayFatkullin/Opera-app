package com.tickets.service.mapper.impl;

import com.tickets.model.ShoppingCart;
import com.tickets.model.Ticket;
import com.tickets.model.dto.ShoppingCartResponseDto;
import com.tickets.service.mapper.ShoppingCartMapper;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartMapperImpl implements ShoppingCartMapper {
    @Override
    public ShoppingCartResponseDto entityToMap(ShoppingCart shoppingCart) {
        ShoppingCartResponseDto shoppingCartResponseDto = new ShoppingCartResponseDto();
        shoppingCartResponseDto.setId(shoppingCart.getId());
        List<Long> ticketsId = shoppingCart.getTickets()
                .stream()
                .map(Ticket::getId)
                .collect(Collectors.toList());
        shoppingCartResponseDto.setTicketsIds(ticketsId);
        return shoppingCartResponseDto;
    }
}
