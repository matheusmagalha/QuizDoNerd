// Pergunta.java
public class Pergunta {
    private String textoPergunta;
    private String[] opcoes;
    private int indiceRespostaCorreta;
    private int dificuldade;
    private boolean isBomba; // NOVO ATRIBUTO

    // Construtor original
    public Pergunta(String textoPergunta, String[] opcoes, int indiceRespostaCorreta, int dificuldade) {
        this.textoPergunta = textoPergunta;
        this.opcoes = opcoes;
        this.indiceRespostaCorreta = indiceRespostaCorreta;
        this.dificuldade = dificuldade;
        this.isBomba = false; // Por padrão, não é bomba
    }

    // Construtor adicional para perguntas bomba
    public Pergunta(String textoPergunta, String[] opcoes, int indiceRespostaCorreta, int dificuldade, boolean isBomba) {
        this(textoPergunta, opcoes, indiceRespostaCorreta, dificuldade); // Chama o construtor original
        this.isBomba = isBomba; // Define se é bomba
    }

    // Getters
    public String getTextoPergunta() {
        return textoPergunta;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public int getIndiceRespostaCorreta() {
        return indiceRespostaCorreta;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public boolean isBomba() { // NOVO MÉTODO GETTER
        return isBomba;
    }
}