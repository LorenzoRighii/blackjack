package br.com.joaocarloslima.vinteum.model;

public class Cautelosa implements EstiloDeJogo {

    @Override
    public String getNome() {
        return "Cautelosa";
    }

    @Override
    public boolean querCarta(Mao mao) {
        return mao.getPontos() < 15;
    }
}
