package builder;

public class Pizza {

    private String massa;
    private String molho;
    private boolean queijoExtra;
    private boolean bordaRecheada;

    public Pizza(String massa, String molho,
                 boolean queijoExtra,
                 boolean bordaRecheada) {

        this.massa = massa;
        this.molho = molho;
        this.queijoExtra = queijoExtra;
        this.bordaRecheada = bordaRecheada;
    }

    public String getMassa() {
        return massa;
    }

    public String getMolho() {
        return molho;
    }

    public boolean isQueijoExtra() {
        return queijoExtra;
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }
}