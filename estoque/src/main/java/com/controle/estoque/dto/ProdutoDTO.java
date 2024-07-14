package com.controle.estoque.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;
}
