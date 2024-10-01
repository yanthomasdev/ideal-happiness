public class Burguer extends Produto {
    public int gramas;
    
    public Burguer(String descrição, Double preço, int gramas) {
        super(descrição, preço);
        this.gramas = gramas;
    }
}