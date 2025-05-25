public class Jogador {
    String nome;
    int pontuacao;
    int perguntasRespondidas;
    int posicaoNoTabuleiro;

    // Construtor: usado para criar um novo jogador
    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0; // Começa com 0 pontos
        this.perguntasRespondidas = 0; // Começa com 0 perguntas respondidas
        this.posicaoNoTabuleiro = 0; // Começa na primeira casa do tabuleiro (posição 0)
    }

    // Métodos (funções) para acessar e modificar os dados do jogador

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void adicionarPontuacao(int pontos) {
        this.pontuacao += pontos;
    }

    public int getPerguntasRespondidas() {
        return perguntasRespondidas;
    }

    public void incrementarPerguntasRespondidas() {
        this.perguntasRespondidas++;
    }

    public int getPosicaoNoTabuleiro() {
        return posicaoNoTabuleiro;
    }

    // Move o jogador para frente no tabuleiro
    public void avancarNoTabuleiro(int casas, int tamanhoTotalTabuleiro) {
        this.posicaoNoTabuleiro += casas;
        // Garante que o jogador não passe do final do tabuleiro
        if (this.posicaoNoTabuleiro >= tamanhoTotalTabuleiro - 1) {
            this.posicaoNoTabuleiro = tamanhoTotalTabuleiro - 1; // Para na última casa
        }
    }
}