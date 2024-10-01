public class Sobremesa extends Produto {
    public String tamanho;
    
    public Sobremesa(String descrição, Double preço, String tamanho) {
        super(descrição, preço);
        this.tamanho = tamanho;
    }
}