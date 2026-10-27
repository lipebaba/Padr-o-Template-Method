public class Aplicacao {
    public static void main(String[] args) {
        RelatorioAmbiental agua = new RelatorioAgua(1200);
        RelatorioAmbiental residuos = new RelatorioResiduos(85);
        System.out.println(agua.gerar());
        System.out.println();
        System.out.println(residuos.gerar());
    }
}