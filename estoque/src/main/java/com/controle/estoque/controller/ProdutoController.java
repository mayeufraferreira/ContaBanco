package com.controle.estoque.controller;

import com.controle.estoque.dto.ProdutoDTO;
import com.controle.estoque.entity.Produto;
import com.controle.estoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoDTO> listar() {
        return produtoService.listarProdutos();
    }

    @GetMapping("/buscar/{id}")
    public ProdutoDTO buscarPorId(@PathVariable Long id) {
        return produtoService.buscarProdutoPorId(id);
    }

    @PostMapping("/criar")
    public ProdutoDTO salvar(@RequestBody ProdutoDTO produto) {
        produtoService.criarProduto(produto);
        return produto;
    }
}
