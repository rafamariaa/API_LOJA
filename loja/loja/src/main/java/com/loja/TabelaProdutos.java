package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    /**
     * No construtor a lista de produtos sera preenchida
     */
    public TabelaProdutos(){
        Produto caneta = new Produto(1,"Caneta BIC","canetabic cor azul", 1.99);
        Produto borracha = new Produto(2,"Borracha branca", "borracha branca comum", 3.99);
        Produto lapis = new Produto(3,"Lapis faber castel", "lapis grafite preto", 2.99);
        Produto apontador = new Produto(4, "apontador", "apontador comum  com reservatorio",7.99);
        Produto caderno = new Produto(5, "Caderno espiral", "Caderno espiral com 200 folhas", 15.98);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    /**
     * Metodo que retorna todos os produtos da lista
     */
    public List<Produto> buscarTodosProdutos(){
        return this.getProdutos();
    }
}
