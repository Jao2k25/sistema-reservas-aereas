public class Passageiro {
    private String nome;
    private String numeroDocumento;
    private String telefone;

    // Construtor
    public Passageiro(String nome, String numeroDocumento, String telefone) {
        this.nome = nome;
        this.numeroDocumento = numeroDocumento;
        this.telefone = telefone;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getTelefone() {
        return telefone;
    }

    // Método para exibir informações do passageiro
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Documento: " + numeroDocumento);
        System.out.println("Telefone: " + telefone);
    }
}
