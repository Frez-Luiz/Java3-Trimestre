public class Main5 {
    
     public static void main(String[] args) {
        Produto p = new Produto("Notebook", 3500.0, 10);

        p.setPreco(-500.0); 
        p.adicionarEstoque(5);
        p.removerEstoque(3);

        System.out.println("Produto: " + p.getNome());
        System.out.println("Preço: R$ " + p.getPreco());
        System.out.println("Estoque: " + p.getQuantidadeEstoque());
    }
}

