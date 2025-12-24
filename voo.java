import java.util.ArrayList;

public class Voo {
    private String numeroVoo;
    private String origem;
    private String destino;
    private String dataHoraPartida;
    private int totalAssentos;
    private ArrayList<Integer> assentosDisponiveis;

    // Construtor
    public Voo(String numeroVoo, String origem, String destino, String dataHoraPartida, int totalAssentos) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
        this.totalAssentos = totalAssentos;
        this.assentosDisponiveis = new ArrayList<>();
        for (int i = 1; i <= totalAssentos; i++) {
            assentosDisponiveis.add(i); // Assentos numerados de 1 até totalAssentos
        }
    }

    // Getters
    public String getNumeroVoo() {
        return numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public String getDataHoraPartida() {
        return dataHoraPartida;
    }

    public int getTotalAssentos() {
        return totalAssentos;
    }

    public int getAssentosDisponiveisCount() {
        return assentosDisponiveis.size();
    }

    // Método para reservar assento
    public boolean reservarAssento() {
        if (!assentosDisponiveis.isEmpty()) {
            assentosDisponiveis.remove(0); // Remove o primeiro assento disponível
            return true;
        }
        return false;
    }

    // Método para exibir informações do voo
    public void exibirInformacoes() {
        System.out.println("Voo: " + numeroVoo);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Data/Hora: " + dataHoraPartida);
        System.out.println("Total de Assentos: " + totalAssentos);
        System.out.println("Assentos Disponíveis: " + getAssentosDisponiveisCount());
    }
}
