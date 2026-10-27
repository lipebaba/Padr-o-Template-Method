public class RelatorioResiduos extends RelatorioAmbiental {
    private final int quantidadeKg;
    public RelatorioResiduos(int quantidadeKg) {
        if (quantidadeKg < 0) throw new IllegalArgumentException("Quantidade negativa");
        this.quantidadeKg = quantidadeKg;
    }
    @Override protected String apresentarDados() {
        return "Residuos reciclados: " + quantidadeKg + " kg";
    }
}