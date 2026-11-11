package br.com.joaocarloslima.vinteum.model;

import java.util.List;

public abstract class Participante {

    private Mao mao = new Mao();
    private boolean parou = false;

    public abstract boolean querCarta();

    public void receberCarta(Carta carta) {
        mao.adicionar(carta);
    }

    public void parar() {
        parou = true;
    }

    public boolean parou() {
        return parou;
    }

    public int getPontos() {
        return mao.getPontos();
    }

    public boolean estourou() {
        return mao.estourou();
    }

    public List<Carta> getCartas() {
        return mao.getCartas();
    }

    protected Mao getMao() {
        return mao;
    }
}
