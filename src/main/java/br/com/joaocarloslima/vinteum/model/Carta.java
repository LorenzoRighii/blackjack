package br.com.joaocarloslima.vinteum.model;

public class Carta {

    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public int getValor() {
        return Math.min(numero, 10);
    }

    public String getImagem() {
        String nome;
        switch (numero) {
            case 1:
                nome = "Ace";
                break;
            case 11:
                nome = "Jack";
                break;
            case 12:
                nome = "Queen";
                break;
            case 13:
                nome = "King";
                break;
            default:
                nome = String.valueOf(numero);
        }
        return nome + naipe.name() + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }
}
