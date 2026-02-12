import java.util.Scanner;

class Produto {
    String nome;
    int quantidade;
    double precoUnitario;

    // Construtor para inicializar o produto
    public Produto(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // Método para calcular valor total em estoque
    public double calcularTotal() {
        return quantidade * precoUnitario;
    }

    public void exibirRelatorio() {
        System.out.println("\n--- RELATÓRIO DE EXPEDIÇÃO ---");
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade em Estoque: " + quantidade);
        System.out.println("Valor Total da Carga: R$ " + calcularTotal());
        System.out.println("------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Sistema de Logística Alexandre - Iniciado");
        
        System.out.print("Digite o nome do produto: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a quantidade recebida na expedição: ");
        int qtd = leitor.nextInt();

        System.out.print("Digite o valor unitário: ");
        double preco = leitor.nextDouble();

        // Criando o objeto do produto
        Produto p1 = new Produto(nome, qtd, preco);
        
        // Exibindo os dados
        p1.exibirRelatorio();

        leitor.close();
    }
}
