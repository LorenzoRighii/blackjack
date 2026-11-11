package br.com.joaocarloslima.vinteum.model;

public class Jogo {

    private Monte monte;
    private Jogador jogador;
    private Mesa mesa;

    public Jogo() {
        monte = new Monte();
        jogador = new Jogador();
        mesa = new Mesa();
        monte.embaralhar();
        for (int i = 0; i < 2; i++) {
            jogador.receberCarta(monte.virar());
            mesa.receberCarta(monte.virar());
        }
    }

    public void pedirCarta() {
        if (jogador.querCarta()) {
            jogador.receberCarta(monte.virar());
            if (jogador.estourou()) {
                jogador.parar();
            }
        }
    }

    public void parar() {
        jogador.parar();
        while (mesa.querCarta()) {
            mesa.receberCarta(monte.virar());
        }
        mesa.parar();
    }

    public boolean acabou() {
        return jogador.estourou() || (jogador.parou() && mesa.parou());
    }

    public String resultado() {
        if (!acabou()) {
            return "";
        }
        if (jogador.estourou()) {
            return "Você perdeu";
        }
        if (mesa.estourou() || jogador.getPontos() > mesa.getPontos()) {
            return "Você ganhou";
        }
        if (jogador.getPontos() < mesa.getPontos()) {
            return "Você perdeu";
        }
        return "Empate";
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Monte getMonte() {
        return monte;
    }
}
