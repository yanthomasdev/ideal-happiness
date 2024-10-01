public class Combo {
    private Bebida bebida;
    private Sobremesa sobremesa;
    private Burguer burguer;
    
    public Combo() {};
    
    public void CriarCombo(int tipo) {
        switch (tipo) {
            case 1:
                this.burguer = new Burguer("Pão de brioche, hambúrguer de 150g de carne bovina grelhada, queijo cheddar, alface, tomate, cebola roxa, picles e molho especial da casa.", 28.90, 320);
                this.bebida = new Bebida("Refrigerante de cola tradicional, servido bem gelado.", 6.50, 350);
                this.sobremesa = new Sobremesa("Pudim de leite condensado com calda de caramelo.", 8.00, "Médio");
                break;
            case 2:
                this.burguer = new Burguer("Pão de gergelim, hambúrguer de 120g de frango grelhado, queijo suíço, alface americana, tomate, cebola caramelizada e maionese temperada.", 26.50, 290);
                this.bebida = new Bebida("Suco natural de laranja.", 7.00, 300);
                this.sobremesa = new Sobremesa("Mousse de maracujá com raspas de chocolate branco.", 9.50, "Pequeno");
                break;
        }
    }
    
    public String toString() {
        return "Hambúrguer: " + this.burguer.descrição + " (" + this.burguer.gramas + "g) " + "R$ " + this.burguer.preço + "\n" + "Bebida: " + this.bebida.descrição + " (" + this.bebida.ml + "ml) " + "R$ " + this.bebida.preço + "\n" + "Sobremesa: " + this.sobremesa.descrição + " (" + this.sobremesa.tamanho + ") " + "R$ " + this.sobremesa.preço;
    }
}