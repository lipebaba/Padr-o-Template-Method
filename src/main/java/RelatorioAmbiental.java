public abstract class RelatorioAmbiental {
    public final String gerar() {
        return cabecalho() + "\n" + apresentarDados() + "\n" + rodape();
    }
    private String cabecalho() { return "RELATORIO AMBIENTAL"; }
    protected abstract String apresentarDados();
    private String rodape() { return "Fim do relatorio"; }
}