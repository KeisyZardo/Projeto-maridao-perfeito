import java.util.Scanner;

public class Projetomaridaoclass_corrigido {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int pontos = 0;
        String[] respostasDele = new String[5];

        System.out.println("========================================");
        System.out.println("     🎮 O JOGO DO MARIDÃO PERFEITO 🎮");
        System.out.println("========================================\n");

        System.out.println("Olá, amoreco!");
        System.out.println("Está preparado para passar no teste mais importante da sua vida?");
        System.out.println("Prepare-se!\n");

        // PERGUNTA 1: DATA
        System.out.println("1. Qual o dia exato em que adotamos a gatinha Canela? (DD/MM/AAAA)");
        respostasDele[0] = teclado.nextLine().trim();

        if (respostasDele[0].equals("15/05/2024")) {
            System.out.println("Parabéns! Você é um pai presente! +10 pontos.");
            pontos += 10;
        } else {
            System.out.println("ERROU! COMO VOCÊ PODE FAZER ISSO COM NOSSA FILHA?! 😿 0 pontos.");
        }

        // PERGUNTA 2: COMIDA
        System.out.println("\n2. Qual é a minha comida favorita no mundo inteiro?");
        respostasDele[1] = teclado.nextLine().trim();

        if (respostasDele[1].equalsIgnoreCase("sushi")) {
            System.out.println("ACERTOU, MISERÁVI! +10 PONTOS.");
            pontos += 10;
        } else {
            System.out.println("ERROU! 0 AMOR. 0 pontos.");
        }

        // PERGUNTA 3: ESCOLHA MÚLTIPLA
        System.out.println("\n3. Escolha uma opção muito séria:");
        System.out.println("A) Jotta a Peste");
        System.out.println("B) A Mamolada");
        System.out.print("Qual é a tua escolha? (A/B): ");
        respostasDele[2] = teclado.nextLine().trim();

        if (respostasDele[2].equalsIgnoreCase("B")) {
            System.out.println("Resposta correta! Escolheste a Mamolada, que bom gosto! +10 pontos.");
            pontos += 10;
        } else if (respostasDele[2].equalsIgnoreCase("A")) {
            System.out.println("Jotta a Peste?! A sério? Que perigo... 0 pontos!");
        } else {
            System.out.println("Opção inválida! Tentou fugir da pergunta? 😂 0 pontos.");
        }

        // PERGUNTA 4: PERCENTAGEM DE AMOR
        int amor = -1;
        while (amor < 0 || amor > 100) {
            System.out.println("\n4. De 0 a 100%, o quanto é que tu me amas?");
            System.out.print("Digita um número entre 0 e 100: ");

            String entrada = teclado.nextLine().trim();
            try {
                amor = Integer.parseInt(entrada);
                if (amor < 0 || amor > 100) {
                    System.out.println("Ei! Tem que ser um número de 0 a 100, hein! 😂");
                }
            } catch (NumberFormatException e) {
                amor = -1;
                System.out.println("Isso não é um número válido! Tenta de novo.");
            }
        }

        respostasDele[3] = String.valueOf(amor);

        if (amor == 100) {
            System.out.println("PARABÉNS! ISSO É 100% AMOR! +10 pontos.");
            pontos += 10;
        } else {
            System.out.println(amor + "%?! Menos de 100%?! 😤 0 pontos.");
        }

        // PERGUNTA 5: PERGUNTA SURPRESA
        System.out.println("\n5. Pergunta surpresa: o que mais importa em um relacionamento?");
        System.out.println("A) Ganhar todas as discussões");
        System.out.println("B) Carinho, respeito e parceria");
        System.out.println("C) Ganhar presentes caros");
        System.out.print("Escolhe A, B ou C: ");
        respostasDele[4] = teclado.nextLine().trim();

        if (respostasDele[4].equalsIgnoreCase("B")) {
            System.out.println("AÍ SIM! O segredo é carinho, respeito e parceria! +10 pontos. ❤️");
            pontos += 10;
        } else {
            System.out.println("Resposta errada! Dica: relacionamento é parceria! 😂 0 pontos.");
        }

        // GRANDE FINAL
        System.out.println("\n========================================");
        System.out.println("             🏆 FIM DO JOGO 🏆");
        System.out.println("========================================");
        System.out.println("Pontuação total do maridão: " + pontos + " de 50 pontos.");
        System.out.println("----------------------------------------");

        if (pontos == 50) {
            System.out.println("CLASSIFICAÇÃO: LENDA DO AMOR! Maridão do Ano! ❤️💍");
            System.out.println("Mensagem especial: você gabaritou! Agora merece um beijo e um abraço!");
        } else if (pontos >= 40) {
            System.out.println("CLASSIFICAÇÃO: MARIDÃO DE ELITE! Quase gabaritou! 🥰");
            System.out.println("Mensagem especial: tá indo muito bem, amoreco!");
        } else if (pontos >= 30) {
            System.out.println("CLASSIFICAÇÃO: MARIDÃO PROMISSOR! 😂");
            System.out.println("Mensagem especial: tem potencial, mas precisa estudar mais!");
        } else if (pontos >= 10) {
            System.out.println("CLASSIFICAÇÃO: MARIDÃO EM TREINAMENTO. 😅");
            System.out.println("Mensagem especial: revisão do relacionamento recomendada!");
        } else {
            System.out.println("CLASSIFICAÇÃO: ALERTA VERMELHO NO ROMANCE! 🚨");
            System.out.println("Mensagem especial: melhor refazer o teste com carinho!");
        }

        teclado.close();
    }
}
