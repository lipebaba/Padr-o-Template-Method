public class RelatorioAgua extends RelatorioAmbiental {
    private final int consumoLitros;
    public RelatorioAgua(int consumoLitros) {
        if (consumoLitros < 0) throw new IllegalArgumentException("Consumo negativo");
        this.consumoLitros = consumoLitros;
    }
    @Override protected String apresentarDados() {
        return "Consumo de agua: " + consumoLitros + " litros";
    }
}