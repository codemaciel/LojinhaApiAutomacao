package br.com.lojinha;

import br.com.lojinha.Enums.Tamanho;
import br.com.lojinha.Pojo.ItenIncluso;
import br.com.lojinha.Pojo.Produto;
import br.com.lojinha.Pojo.ProdutoInternacional;
import br.com.lojinha.Pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main(String[] args) {

        Produto meuproduto = new Produto("Sony 10",Tamanho.GRANDE);

        meuproduto.getNome();
        meuproduto.setNome("Playstatione");
        meuproduto.setValor(1);
        meuproduto.getValor();
        meuproduto.getTamanho();

        List<ItenIncluso> itensInclusos = new ArrayList<>();

        ItenIncluso primeiroItemAdicional = new ItenIncluso();
        primeiroItemAdicional.setNome("Controle");
        primeiroItemAdicional.setQuantidade(3);
        itensInclusos.add(primeiroItemAdicional);

        ItenIncluso segundoItemAdicional = new ItenIncluso();
        segundoItemAdicional.setNome("jogo");
        segundoItemAdicional.setQuantidade(4);
        itensInclusos.add(segundoItemAdicional);

        meuproduto.setItensInclusos(itensInclusos);

        //meuproduto.setItensInclusos("controle 1 , Controle 2");
        meuproduto.getItensInclusos();

        for (ItenIncluso itematual: meuproduto.getItensInclusos()){
            System.out.println(itematual.getNome());
            System.out.println(itematual.getQuantidade());
        }


        ProdutoNacional produtoNacioanl = new ProdutoNacional("sony", Tamanho.GRANDE);
        produtoNacioanl.setImpostoNacional(1.0000);
        System.out.println(produtoNacioanl.getImpostoNacional());

        ProdutoInternacional produtointernacional = new ProdutoInternacional("sony", Tamanho.GRANDE);
        produtointernacional.setValor(100);
        System.out.println(produtointernacional.getValor());




    }
}
