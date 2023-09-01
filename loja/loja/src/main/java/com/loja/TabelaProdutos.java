package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    /**
     * No construtor a lista de produtos sera preenchida
     */
    public TabelaProdutos() {
        Produto caneta = new Produto(1, "Caneta BIC", "canetabic cor azul", 1.99);
        Produto borracha = new Produto(2, "Borracha branca", "borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lapis faber castel", "lapis grafite preto", 2.99);
        Produto apontador = new Produto(4, "apontador", "apontador comum  com reservatorio", 7.99);
        Produto caderno = new Produto(5, "Caderno espiral", "Caderno espiral com 200 folhas", 15.98);
        Produto lapiseira = new Produto(6,"Lapiseira","Lapiseira grafite 0.7", 5.98);
        Produto garrafa = new Produto(7, "garrafa", "garrafinha 500ml", 28.99);
        Produto estojo = new Produto(8,"estojo ladi bug", "estojo 2 bolsos", 19.00);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
        this.produtos.add(lapiseira);
        this.produtos.add(garrafa);
        this.produtos.add(estojo);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * Metodo que retorna todos os produtos da lista
     */
    public List<Produto> buscarTodosProdutos() {
        return this.getProdutos();
    }

    /**
     * Metodo de buscar um produto pelo id
     * Caso não encontre vai retornar nulo
     * @param produtoId
     * @return
     */
    public Produto busarProdutoPeloId(int produtoId) {
        Produto produtoProcurado = null;
        for (Produto p : this.produtos) {
            if (p.getId() == produtoId) {
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }

    /**
     * Metodo cadastro de um novo produto
     * primeira busca o último item da lista
     * @param novoProduto
     * @return
     */

    public Produto cadatrarNovoProduto(Produto novoProduto){
        int ultimoIndex = this.produtos.size() -1;
        Produto ultimoProduto = this.produtos.get(ultimoIndex);
        int proximoId = ultimoProduto.getId() + 1;
        novoProduto.setId(proximoId);
        this.produtos.add(novoProduto);
        return novoProduto;
    }

    /**
     * método que atualiza um produto
     * primeiro busca o produto a atualizar pelo id
     * depois atribui as novas informações: nome, descrição, valor
     * finalmete salva o produto atualizado
     * @param produtosId
     * @param produtoAtualizar
     */

    public void atualizarProdutos(int produtosId, Produto produtoAtualizar){
        Produto produtoProcurado = this.busarProdutoPeloId(produtosId);
        if (produtoProcurado != null){
            produtoProcurado.setNome(produtoAtualizar.getNome());
            produtoProcurado.setDescricao(produtoAtualizar.getDescricao());
            produtoProcurado.setValorUnitario(produtoAtualizar.getValorUnitario());
        }
    }
}
