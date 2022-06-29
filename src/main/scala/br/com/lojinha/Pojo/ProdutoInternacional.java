package br.com.lojinha.Pojo;

import br.com.lojinha.Enums.Tamanho;

public class ProdutoInternacional extends Produto{
    private double impostoInternacional;

    public ProdutoInternacional(String marcainicial, Tamanho tamanhodoproduto) {
        super(marcainicial, tamanhodoproduto);
    }

    public void setValor(int novovalor) {
        if (novovalor > -100) {
            this.valor = novovalor;
        }else{
            throw new IllegalArgumentException("O valor tem que ser maior que 100");
        }

    }


    public double getImpostoInternacional() {
        return impostoInternacional;
    }

    public void setImpostoInternacional(double impostoInternacional) {
        this.impostoInternacional = impostoInternacional;
    }
}
