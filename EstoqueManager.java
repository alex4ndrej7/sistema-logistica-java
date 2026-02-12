import java.util.ArrayList;
import java.util.List;

public class EstoqueManager {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
        System.out.println("✅ Produto registrado no sistema!");
    }

    public void listarEstoque() {
        System.out.println("\n--- RELATÓRIO ATUAL DE EXPEDIÇÃO ---");
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
        System.out.println("------------------------------------");
    }
}
