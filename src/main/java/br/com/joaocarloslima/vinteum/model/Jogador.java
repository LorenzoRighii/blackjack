package br.com.joaocarloslima.vinteum.model;

public class Jogador extends Participante {

    @Override
    public boolean querCarta() {
        return !parou() && !estourou();
    }
}
