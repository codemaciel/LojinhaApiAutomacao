package br.com.lojinha.Pojo;

import br.com.lojinha.Enums.Tamanho;

public class ProdutoNacional extends Produto {
    private double impostoNacional;

    public ProdutoNacional(String marcainicial, Tamanho tamanhodoproduto) {
        super(marcainicial, tamanhodoproduto);
    }


    public double getImpostoNacional() {
        return impostoNacional;
    }

    public void setImpostoNacional(double impostoNacional) {
        this.impostoNacional = impostoNacional;
    }

    public String getDadosFavoritos () {
        return this.getNome() + ", "+ this.getMarca() +" e " + this.getValor();
    }


}
