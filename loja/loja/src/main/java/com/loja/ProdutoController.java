package com.loja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loja/produtos")
public class ProdutoController {
    private TabelaProdutos tabelaDeProdutos;

    public ProdutoController() {
        this.tabelaDeProdutos = new TabelaProdutos();
    }

    @GetMapping
    public List<Produto> buscarTodosOsProdutosDaLoja() {
        return this.tabelaDeProdutos.buscarTodosProdutos();
    }

    @GetMapping("/{produtoId}")
    public Produto buscarProdutoPeloIdNaLoja(@PathVariable int produtoId){
        Produto produtoProcurado = this.tabelaDeProdutos.busarProdutoPeloId(produtoId);
        return produtoProcurado;
    }

}
