public class Pergunta {
    String textoPergunta;
    String[] opcoes;
    int indiceRespostaCorreta; // O índice da resposta correta no array de opções (0 para a primeira, 1 para a segunda, etc.)
    int dificuldade; // De 1 a 6, como no dado

    // Construtor: usado para criar uma nova pergunta
    public Pergunta(String textoPergunta, String[] opcoes, int indiceRespostaCorreta, int dificuldade) {
        this.textoPergunta = textoPergunta;
        this.opcoes = opcoes;
        this.indiceRespostaCorreta = indiceRespostaCorreta;
        this.dificuldade = dificuldade;
    }

    // Métodos (funções) para acessar os dados da pergunta
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
}