public class Bebida extends Produto {
    public int ml;
    
    public Bebida(String descrição, Double preço, int ml) {
        super(descrição, preço);
        this.ml = ml;
    }
}