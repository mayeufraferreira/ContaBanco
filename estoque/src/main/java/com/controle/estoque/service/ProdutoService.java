package com.controle.estoque.service;

import com.controle.estoque.dto.ProdutoDTO;
import com.controle.estoque.entity.Produto;
import com.controle.estoque.repository.ProdutoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoDTO> listarProdutos() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public ProdutoDTO buscarProdutoPorId(Long id) {
        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        return convertToDTO(produto);
    }

    public ProdutoDTO criarProduto(ProdutoDTO produtoDTO) {
        Produto produto = convertToEntity(produtoDTO);
        produto = produtoRepository.save(produto);
        return convertToDTO(produto);
    }

    private ProdutoDTO convertToDTO(Produto produto) {
        ProdutoDTO produtoDTO = new ProdutoDTO();
        BeanUtils.copyProperties(produto, produtoDTO);
        return produtoDTO;
    }

    private Produto convertToEntity(ProdutoDTO produtoDTO) {
        Produto produto = new Produto();
        BeanUtils.copyProperties(produtoDTO, produto);
        return produto;
    }
}