package br.com.joaocarloslima.vinteum.model;

public class Arriscada implements EstiloDeJogo {

    @Override
    public String getNome() {
        return "Arriscada";
    }

    @Override
    public boolean querCarta(Mao mao) {
        return mao.getPontos() < 19;
    }
}
