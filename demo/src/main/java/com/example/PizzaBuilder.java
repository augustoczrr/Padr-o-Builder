package builder;

public class PizzaBuilder {

    private String massa;
    private String molho;
    private boolean queijoExtra;
    private boolean bordaRecheada;

    public PizzaBuilder setMassa(String massa) {
        this.massa = massa;
        return this;
    }

    public PizzaBuilder setMolho(String molho) {
        this.molho = molho;
        return this;
    }

    public PizzaBuilder setQueijoExtra(boolean queijoExtra) {
        this.queijoExtra = queijoExtra;
        return this;
    }

    public PizzaBuilder setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
        return this;
    }

    public Pizza build() {
        return new Pizza(
                massa,
                molho,
                queijoExtra,
                bordaRecheada
        );
    }
}