package secao16;

import java.util.ArrayList;
import java.util.Scanner;

public class SimuladorLoteria {
    public static void main(String[] args) {
        ArrayList<Bilhete> bilhetes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        //Solicitando bilhetes ao usuário
        while (true) {
            System.out.println("Digite 6 números para o seu bilhete (entre 1 e 60)");

            int[] numerosEscolhidos = new int[6];
            for (int i = 0; i < 6; i++) {
                System.out.println("Digite o número " + (i + 1) + ": ");
                numerosEscolhidos[i] = scanner.nextInt();
            }

            Bilhete bilhete = new Bilhete(numerosEscolhidos);
            bilhetes.add(bilhete);


            
            System.out.println("Deseja registrar outro bilhete? (s/n)");

            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        //Realizar o sorteio para cada bilhete
        System.out.println("Sorteando números...");

        for (Bilhete bilhete : bilhetes) {
            bilhete.realizarSorteio();
            bilhete.exibirResultado();
        }

        scanner.close();
    }
}
