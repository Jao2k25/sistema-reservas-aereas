import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Voo> voos = new ArrayList<>();

        // Exemplo: cadastro de um voo
        Voo voo1 = new Voo("ABC123", "São Paulo", "Rio de Janeiro", "01/04/2025 10:00", 5);
        voos.add(voo1);

        while (true) {
            System.out.println("\n--- Sistema de Reservas Aéreas ---");
            System.out.println("1. Cadastrar novo voo");
            System.out.println("2. Reservar assento");
            System.out.println("3. Consultar voo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            if (opcao == 1) {
                // Cadastro de voo
                System.out.print("Número do voo: ");
                String numeroVoo = scanner.nextLine();
                System.out.print("Origem: ");
                String origem = scanner.nextLine();
                System.out.print("Destino: ");
                String destino = scanner.nextLine();
                System.out.print("Data e hora (ex: 01/04/2025 10:00): ");
                String dataHora = scanner.nextLine();
                System.out.print("Total de assentos: ");
                int totalAssentos = scanner.nextInt();
                scanner.nextLine();

                Voo novoVoo = new Voo(numeroVoo, origem, destino, dataHora, totalAssentos);
                voos.add(novoVoo);
                System.out.println("Voo cadastrado com sucesso!");

            } else if (opcao == 2) {
                // Reserva de assento
                System.out.print("Nome do passageiro: ");
                String nome = scanner.nextLine();
                System.out.print("Número do documento: ");
                String documento = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("Número do voo para reservar: ");
                String numeroVoo = scanner.nextLine();

                Passageiro passageiro = new Passageiro(nome, documento, telefone);
                boolean vooEncontrado = false;
                for (Voo voo : voos) {
                    if (voo.getNumeroVoo().equals(numeroVoo)) {
                        vooEncontrado = true;
                        if (voo.reservarAssento()) {
                            System.out.println("Assento reservado com sucesso para " + passageiro.getNome());
                        } else {
                            System.out.println("Não há assentos disponíveis neste voo.");
                        }
                        break;
                    }
                }
                if (!vooEncontrado) {
                    System.out.println("Voo não encontrado.");
                }

            } else if (opcao == 3) {
                // Consulta de voo
                System.out.print("Número do voo para consultar: ");
                String numeroVoo = scanner.nextLine();
                boolean vooEncontrado = false;
                for (Voo voo : voos) {
                    if (voo.getNumeroVoo().equals(numeroVoo)) {
                        voo.exibirInformacoes();
                        vooEncontrado = true;
                        break;
                    }
                }
                if (!vooEncontrado) {
                    System.out.println("Voo não encontrado.");
                }

            } else if (opcao == 4) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
