import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EstoqueManager gestor = new EstoqueManager();
        int opcao = 0;

        System.out.println("📦 LOGÍSTICA PRO v2.0 - Sistema Alexandre Araujo");

        while (opcao != 3) {
            System.out.println("\n1- Registrar Entrada | 2- Ver Relatório | 3- Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            if (opcao == 1) {
                System.out.print("Nome do Produto: ");
                String nome = sc.nextLine();
                System.out.print("Quantidade: ");
                int qtd = sc.nextInt();
                System.out.print("Preço Unitário: ");
                double preco = sc.nextDouble();
                gestor.adicionarProduto(new Produto(nome, qtd, preco));
            } else if (opcao == 2) {
                gestor.listarEstoque();
            }
        }
        System.out.println("Sistema encerrado. Logs salvos.");
        sc.close();
    }
}
