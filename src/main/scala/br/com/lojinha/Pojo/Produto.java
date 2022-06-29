package br.com.lojinha.Pojo;

import br.com.lojinha.Enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    protected int valor;
    private String marca;
    private Tamanho tamanho;
    private List<ItenIncluso> itensInclusos;

    public Produto(String marcainicial, Tamanho tamanhodoproduto){
        this.marca = marcainicial;
        this.tamanho = tamanhodoproduto;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novonome) {
        this.nome = novonome;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int novovalor) {
        if (novovalor > 0) {
            this.valor = novovalor;
        }else{
            throw new IllegalArgumentException("O valor tem que ser maior que 0");
        }

    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String novamarca) {
        this.marca = novamarca;
    }

    public Tamanho getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(Tamanho novotamanho){
        this.tamanho = novotamanho;
    }

    public List<ItenIncluso> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<ItenIncluso> novoitensInclusos) {
        this.itensInclusos = novoitensInclusos;
    }
}
