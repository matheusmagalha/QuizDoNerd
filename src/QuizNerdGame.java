// QuizNerdGame.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Comparator;

public class QuizNerdGame {

    // --- Constantes do Tabuleiro ---
    public static final int TAMANHO_LADO_TABULEIRO = 2;
    public static final int TAMANHO_TOTAL_TABULEIRO = TAMANHO_LADO_TABULEIRO * TAMANHO_LADO_TABULEIRO;

    // --- Lista para Armazenar Todas as Perguntas ---
    public static ArrayList<Pergunta> todasAsPerguntas = new ArrayList<>();

    // --- Função para Carregar as Perguntas
    public static void carregarPerguntas() {
        // Dificuldade 1 (Muito Fácil)
        todasAsPerguntas.add(new Pergunta("Qual a sigla para Unidade Central de Processamento?", new String[]{"RAM", "CPU", "HD", "USB"}, 1, 1));
        todasAsPerguntas.add(new Pergunta("Qual parte do computador é responsável por armazenar dados temporariamente?", new String[]{"HD", "Processador", "RAM", "Placa de Vídeo"}, 2, 1));
        todasAsPerguntas.add(new Pergunta("O que é um 'software'?", new String[]{"Parte física do computador", "Programas e aplicativos", "Dispositivo de entrada", "Componente de rede"}, 1, 1));
        todasAsPerguntas.add(new Pergunta("Qual o sistema operacional mais usado em desktops?", new String[]{"Linux", "macOS", "Windows", "Android"}, 2, 1));
        todasAsPerguntas.add(new Pergunta("O que significa WWW na internet?", new String[]{"World Wide Web", "Windows Web World", "Web Wireless Work", "Worldwide Web Pages"}, 0, 1));

        // Dificuldade 2 (Fácil)
        todasAsPerguntas.add(new Pergunta("Qual o principal protocolo para navegação na web?", new String[]{"FTP", "SMTP", "HTTP", "TCP"}, 2, 2));
        todasAsPerguntas.add(new Pergunta("O que é um 'byte'?", new String[]{"Um caractere de texto", "Um bit de informação", "Oito bits", "Um tipo de vírus"}, 2, 2));
        todasAsPerguntas.add(new Pergunta("O que é um 'firewall'?", new String[]{"Um programa para criar jogos", "Um sistema de segurança de rede", "Um tipo de navegador de internet", "Um dispositivo de armazenamento"}, 1, 2));
        todasAsPerguntas.add(new Pergunta("Qual das opções NÃO é um tipo de linguagem de programação?", new String[]{"Java", "Python", "HTML", "C++"}, 2, 2));
        todasAsPerguntas.add(new Pergunta("O que é um algoritmo?", new String[]{"Um tipo de hardware", "Um conjunto de instruções para resolver um problema", "Um erro de software", "Um formato de arquivo"}, 1, 2));

        // Dificuldade 3 (Média)
        todasAsPerguntas.add(new Pergunta("Em programação, o que é uma 'variável'?", new String[]{"Um tipo de função", "Um local na memória para armazenar dados", "Um erro de compilação", "Uma instrução condicional"}, 1, 3));
        todasAsPerguntas.add(new Pergunta("Qual estrutura de controle permite que um bloco de código seja executado repetidamente?", new String[]{"Condicional (if-else)", "Função", "Loop (laço)", "Array"}, 2, 3));
        todasAsPerguntas.add(new Pergunta("Em um banco de dados, o que é uma 'tabela'?", new String[]{"Um tipo de relatório", "Uma coleção de dados organizada em linhas e colunas", "Um comando de programação", "Um tipo de conexão de rede"}, 1, 3));
        todasAsPerguntas.add(new Pergunta("Qual o nome dado à fase de detecção e correção de erros em um programa?", new String[]{"Compilação", "Execução", "Depuração (Debug)", "Codificação"}, 2, 3));
        todasAsPerguntas.add(new Pergunta("O que é a 'nuvem' (cloud computing)?", new String[]{"Um tipo de rede local", "Serviços de computação entregues pela internet", "Um novo sistema operacional", "Um dispositivo de armazenamento externo"}, 1, 3));

        // Dificuldade 4 (Intermediário)
        todasAsPerguntas.add(new Pergunta("Em SQL, qual comando é usado para recuperar dados de um banco de dados?", new String[]{"INSERT", "UPDATE", "SELECT", "DELETE"}, 2, 4));
        todasAsPerguntas.add(new Pergunta("O que significa 'POO' em programação?", new String[]{"Programação Orientada a Objetos", "Processamento de Operações Online", "Protocolo de Otimização de Ondas", "Programação de Operações Ocultas"}, 0, 4));
        todasAsPerguntas.add(new Pergunta("Qual a principal função de um sistema operacional?", new String[]{"Navegar na internet", "Gerenciar os recursos do hardware e software", "Criar documentos de texto", "Enviar e-mails"}, 1, 4));
        todasAsPerguntas.add(new Pergunta("O que é um 'framework' em desenvolvimento de software?", new String[]{"Um tipo de erro de código", "Um conjunto de ferramentas e bibliotecas que oferece uma estrutura para desenvolver aplicações", "Um dispositivo de entrada de dados", "Um método de depuração"}, 1, 4));
        todasAsPerguntas.add(new Pergunta("Qual o nome do processo de transformar código-fonte em um programa executável?", new String[]{"Debug", "Execução", "Compilação", "Interpretação"}, 2, 4));

        // Dificuldade 5 (Desafiador)
        todasAsPerguntas.add(new Pergunta("Qual o protocolo que garante a entrega de dados em uma rede, com controle de fluxo e erros?", new String[]{"UDP", "IP", "ICMP", "TCP"}, 3, 5));
        todasAsPerguntas.add(new Pergunta("O que é 'criptografia' em segurança da informação?", new String[]{"Criação de senhas complexas", "Ocultação de dados para evitar acesso não autorizado", "Verificação de vírus em arquivos", "Proteção contra spam"}, 1, 5));
        todasAsPerguntas.add(new Pergunta("O que é um 'API' (Application Programming Interface)?", new String[]{"Um tipo de vírus de computador", "Um conjunto de definições e protocolos para construir e integrar software de aplicativos", "Um dispositivo de armazenamento de dados", "Um formato de arquivo de imagem"}, 1, 5));
        todasAsPerguntas.add(new Pergunta("Em redes, o que é um 'endereço IP'?", new String[]{"Um nome de usuário", "Um identificador único para um dispositivo em uma rede", "Um tipo de cabo de rede", "Um programa de segurança"}, 1, 5));
        todasAsPerguntas.add(new Pergunta("Qual o conceito de 'escalabilidade' em sistemas?", new String[]{"A facilidade de uso do sistema", "A capacidade do sistema de lidar com um aumento de demanda ou carga", "A segurança dos dados do sistema", "A velocidade de processamento de um sistema"}, 1, 5));

        // Dificuldade 6 (Muito Difícil)
        todasAsPerguntas.add(new Pergunta("Qual metodologia de desenvolvimento de software enfatiza entregas incrementais e interação com o cliente?", new String[]{"Cascata", "V-Model", "Ágil", "Espiral"}, 2, 6));
        todasAsPerguntas.add(new Pergunta("O que é 'virtualização' em TI?", new String[]{"Criação de jogos em realidade virtual", "Simulação de hardware e software para criar ambientes virtuais", "Desenvolvimento de aplicativos móveis", "Segurança de dados na nuvem"}, 1, 6));
        todasAsPerguntas.add(new Pergunta("No contexto de bancos de dados, o que é 'normalização'?", new String[]{"Padronização de nomes de tabelas", "Processo de organização de dados para reduzir redundância e melhorar a integridade", "Criação de backups de dados", "Otimização de consultas SQL"}, 1, 6));
        todasAsPerguntas.add(new Pergunta("Qual o termo para o estudo da interação entre humanos e computadores?", new String[]{"Inteligência Artificial", "Cibersegurança", "Engenharia de Software", "Interação Humano-Computador (IHC)"}, 3, 6));
        todasAsPerguntas.add(new Pergunta("O que representa 'big data'?", new String[]{"Um banco de dados muito grande", "Um grande volume de dados que exige tecnologias e métodos específicos para processamento e análise", "Um tipo de linguagem de programação", "Um dispositivo de armazenamento de alta capacidade"}, 1, 6));
    }

    // --- Funções do Jogo ---

    public static int obterNumeroDeJogadores() {
        Scanner scanner = new Scanner(System.in);
        int numJogadores = 0;
        while (numJogadores <= 0) {
            System.out.print("Digite o número de jogadores: ");
            if (scanner.hasNextInt()) {
                numJogadores = scanner.nextInt();
                if (numJogadores <= 0) {
                    System.out.println("Por favor, digite um número positivo de jogadores.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
            }
        }
        return numJogadores;
    }

    public static int lancarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Gera um número entre 1 e 6
    }

    public static Pergunta obterPerguntaAleatoriaPorDificuldade(int nivelDificuldade) {
        ArrayList<Pergunta> perguntasFiltradas = new ArrayList<>();
        for (Pergunta p : todasAsPerguntas) {
            if (p.getDificuldade() == nivelDificuldade) {
                perguntasFiltradas.add(p);
            }
        }
        if (perguntasFiltradas.isEmpty()) {
            System.out.println("Atenção: Nenhuma pergunta para a dificuldade " + nivelDificuldade + ". Usando uma pergunta aleatória de todas as disponíveis.");
            return todasAsPerguntas.get(new Random().nextInt(todasAsPerguntas.size()));
        }
        Random random = new Random();
        return perguntasFiltradas.get(random.nextInt(perguntasFiltradas.size()));
    }

    public static void jogarTurno(Jogador jogadorAtual) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Vez de " + jogadorAtual.getNome() + " ---");
        System.out.println("Sua posição atual: Casa " + (jogadorAtual.getPosicaoNoTabuleiro() + 1) + " de " + TAMANHO_TOTAL_TABULEIRO);

        int dificuldade = lancarDado();
        System.out.println("Dado lançado: " + dificuldade + " (Nível de Dificuldade para a pergunta)");

        Pergunta perguntaAtual = obterPerguntaAleatoriaPorDificuldade(dificuldade);

        System.out.println("\nPergunta: " + perguntaAtual.getTextoPergunta());
        String[] opcoes = perguntaAtual.getOpcoes();
        for (int i = 0; i < opcoes.length; i++) {
            System.out.println((i + 1) + ". " + opcoes[i]);
        }

        int respostaJogador = -1;
        while (respostaJogador < 1 || respostaJogador > opcoes.length) {
            System.out.print("Sua resposta (1-" + opcoes.length + "): ");
            if (scanner.hasNextInt()) {
                respostaJogador = scanner.nextInt();
                if (respostaJogador < 1 || respostaJogador > opcoes.length) {
                    System.out.println("Opção inválida. Por favor, digite um número entre 1 e " + opcoes.length + ".");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
            }
        }

        if (respostaJogador - 1 == perguntaAtual.getIndiceRespostaCorreta()) {
            System.out.println("Correto! Você ganha " + dificuldade + " ponto(s) e avança uma casa!");
            jogadorAtual.adicionarPontuacao(dificuldade);
            jogadorAtual.avancarNoTabuleiro(1, TAMANHO_TOTAL_TABULEIRO);
            System.out.println(jogadorAtual.getNome() + " está agora na Casa " + (jogadorAtual.getPosicaoNoTabuleiro() + 1) + ".");
        } else {
            System.out.println("Incorreto. A resposta correta era: " + (perguntaAtual.getIndiceRespostaCorreta() + 1) + ". " + opcoes[perguntaAtual.getIndiceRespostaCorreta()]);
            System.out.println("Você não avança no tabuleiro.");
        }
        jogadorAtual.incrementarPerguntasRespondidas();
    }

    public static boolean oJogoAcabou(Jogador[] jogadores) {
        for (Jogador jogador : jogadores) {
            if (jogador.getPosicaoNoTabuleiro() >= TAMANHO_TOTAL_TABULEIRO - 1) {
                return true;
            }
        }
        return false;
    }

    public static void exibirSituacaoDoTabuleiro(Jogador[] jogadores) {
        System.out.println("\n--- Situação Atual do Tabuleiro ---");

        ArrayList<Jogador> ranking = new ArrayList<>(java.util.Arrays.asList(jogadores));
        ranking.sort(Comparator.comparingInt(Jogador::getPosicaoNoTabuleiro).reversed());

        for (int i = 0; i < TAMANHO_TOTAL_TABULEIRO; i++) {
            System.out.print("[" + String.format("%02d", i + 1));
            boolean casaOcupada = false;
            for (Jogador jogador : jogadores) {
                if (jogador.getPosicaoNoTabuleiro() == i) {
                    System.out.print(" " + jogador.getNome().charAt(0));
                    casaOcupada = true;
                }
            }
            if (!casaOcupada) {
                System.out.print("  ");
            }
            System.out.print("]");

            if ((i + 1) % TAMANHO_LADO_TABULEIRO == 0) {
                System.out.println();
            }
        }
        System.out.println("---------------------------------");
        System.out.println("Ranking (Posição no Tabuleiro):");
        for (Jogador j : ranking) {
            System.out.println("- " + j.getNome() + ": Casa " + (j.getPosicaoNoTabuleiro() + 1) + " (Pontuação: " + j.getPontuacao() + ")");
        }
        System.out.println("---------------------------------");
    }

    public static void displayGameResults(Jogador[] jogadores) {
        System.out.println("\n--- Fim de Jogo! Resultados Finais ---");
        ArrayList<Jogador> vencedores = new ArrayList<>();

        int maiorPosicao = -1;
        for (Jogador jogador : jogadores) {
            if (jogador.getPosicaoNoTabuleiro() > maiorPosicao) {
                maiorPosicao = jogador.getPosicaoNoTabuleiro();
            }
        }

        for (Jogador jogador : jogadores) {
            if (jogador.getPosicaoNoTabuleiro() == maiorPosicao) {
                vencedores.add(jogador);
            }
        }

        if (vencedores.isEmpty()) {
            System.out.println("Não houve vencedor claro.");
        } else if (vencedores.size() == 1) {
            Jogador vencedor = vencedores.get(0);
            System.out.println("E o vencedor é: " + vencedor.getNome() + " por ter chegado ao final do tabuleiro! Pontuação: " + vencedor.getPontuacao() + " pontos.");
        } else {
            System.out.println("Temos um empate para o primeiro lugar! Os vencedores são:");
            for (Jogador j : vencedores) {
                System.out.println("- " + j.getNome() + " (Pontuação: " + j.getPontuacao() + ")");
            }
            Jogador vencedorDesempate = vencedores.get(0);
            for (int i = 1; i < vencedores.size(); i++) {
                if (vencedores.get(i).getPontuacao() > vencedorDesempate.getPontuacao()) {
                    vencedorDesempate = vencedores.get(i);
                }
            }
            System.out.println("\nPor desempate (maior pontuação), o grande campeão é: " + vencedorDesempate.getNome() + "!");
        }

        System.out.println("\nPontuações de todos os jogadores:");
        for (Jogador player : jogadores) {
            System.out.println("- " + player.getNome() + ": " + player.getPontuacao() + " pontos. Sua posição no tabuleiro é: " + (player.getPosicaoNoTabuleiro() + 1) + ".");
        }
    }

    // --- MÉTODO ATUALIZADO: Sorteia a ordem dos jogadores por lançamento de dado ---
    public static Jogador[] sortearOrdemJogadores(Jogador[] jogadores) {
        System.out.println("\n--- Lançamento de Dados para Definir a Ordem ---");
        Random random = new Random();

        // Armazena o resultado do dado para cada jogador
        // Usamos um ArrayList de objetos temporários para associar o jogador ao resultado do dado
        class JogadorComDado {
            Jogador jogador;
            int resultadoDado;

            JogadorComDado(Jogador j, int r) {
                this.jogador = j;
                this.resultadoDado = r;
            }
        }

        ArrayList<JogadorComDado> resultadosLances = new ArrayList<>();
        for (Jogador j : jogadores) {
            int dado = random.nextInt(6) + 1; // Lança um dado de 1 a 6
            resultadosLances.add(new JogadorComDado(j, dado));
            System.out.println(j.getNome() + " lançou o dado e tirou: " + dado);
        }

        // Ordena os jogadores pelo resultado do dado (maior primeiro)
        Collections.sort(resultadosLances, Comparator.comparingInt((JogadorComDado jcd) -> jcd.resultadoDado).reversed());

        // Se houver empate, vamos desempate pela ordem de entrada (ou você pode adicionar outra regra)
        // Por simplicidade, o Collections.sort acima já é estável, então a ordem original para empates será mantida.
        // Se quisesse um desempate com outro dado, a lógica seria mais complexa aqui.

        System.out.println("\n--- Ordem dos Jogadores para Começar o Jogo ---");
        Jogador[] jogadoresOrdenados = new Jogador[jogadores.length];
        for (int i = 0; i < resultadosLances.size(); i++) {
            jogadoresOrdenados[i] = resultadosLances.get(i).jogador;
            System.out.println((i + 1) + ". " + jogadoresOrdenados[i].getNome() + " (Dado: " + resultadosLances.get(i).resultadoDado + ")");
        }
        System.out.println("------------------------------------");

        return jogadoresOrdenados;
    }

    // --- Método Principal (Main) - Ponto de Entrada do Programa ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        carregarPerguntas();

        System.out.println("Bem-vindo ao Quiz Nerd do Tabuleiro!");
        System.out.println("O objetivo é ser o primeiro a chegar na Casa " + TAMANHO_TOTAL_TABULEIRO + " do tabuleiro " + TAMANHO_LADO_TABULEIRO + "x" + TAMANHO_LADO_TABULEIRO + "!");

        int numJogadores = obterNumeroDeJogadores();
        Jogador[] jogadores = new Jogador[numJogadores];
        for (int i = 0; i < numJogadores; i++) {
            System.out.print("Digite o nome do Jogador " + (i + 1) + ": ");
            String nome = scanner.next();
            jogadores[i] = new Jogador(nome);
        }

        // --- CHAMADA DO MÉTODO PARA SORTEAR A ORDEM POR DADO ---
        jogadores = sortearOrdemJogadores(jogadores);

        int indiceJogadorAtual = 0;

        while (!oJogoAcabou(jogadores)) {
            Jogador jogadorAtual = jogadores[indiceJogadorAtual];

            exibirSituacaoDoTabuleiro(jogadores);

            jogarTurno(jogadorAtual);

            indiceJogadorAtual = (indiceJogadorAtual + 1) % numJogadores;
        }

        exibirSituacaoDoTabuleiro(jogadores);
        displayGameResults(jogadores);
        scanner.close();
    }
}