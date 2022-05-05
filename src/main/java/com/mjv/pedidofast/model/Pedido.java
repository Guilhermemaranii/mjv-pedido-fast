package com.mjv.pedidofast.model;


import lombok.Data;

import java.util.List;


@Data
public class Pedido {

    private Long id;
    private Cliente cliente;
    private List<ItemPedido> itens;
}
