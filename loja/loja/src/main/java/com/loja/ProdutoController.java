package com.loja;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Produto cadastrarprodutoNaLoja(@RequestBody Produto dadosNovoProduto){
        return this.tabelaDeProdutos.cadatrarNovoProduto((dadosNovoProduto));
    }

    @PutMapping("/{produtoId}")
    public void atualizarProdutoNaLoja(@PathVariable int produtoId, @RequestBody Produto dadosAtualizarProduto){
        this.tabelaDeProdutos.atualizarProdutos(produtoId, dadosAtualizarProduto);
    }

}
