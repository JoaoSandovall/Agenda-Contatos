import java.util.Scanner;

class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

public class AgendaContatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Contato[] contatos = new Contato[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nCadastro do Contato " + (i + 1));
            
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite o telefone: ");
            String telefone = scanner.nextLine();
            
            contatos[i] = new Contato(nome, telefone);
        }
        
        System.out.println("\nModificação dos Contatos");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nContato " + (i + 1) + ": " + contatos[i].getNome() + " - " + contatos[i].getTelefone());
            
            System.out.print("Novo nome (ou enter para manter): ");
            String novoNome = scanner.nextLine();
            if (!novoNome.isEmpty()) {
                contatos[i].setNome(novoNome);
            }
            
            System.out.print("Novo telefone (ou enter para manter): ");
            String novoTelefone = scanner.nextLine();
            if (!novoTelefone.isEmpty()) {
                contatos[i].setTelefone(novoTelefone);
            }
        }
        
        System.out.println("\nContatos Atualizados:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Contato " + (i + 1) + ":");
            System.out.println("Nome: " + contatos[i].getNome());
            System.out.println("Telefone: " + contatos[i].getTelefone());
            System.out.println();
        }
        
        scanner.close();
    }
}