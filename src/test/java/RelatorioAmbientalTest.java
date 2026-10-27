import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RelatorioAmbientalTest {
    @Test void deveGerarRelatorioDeAguaNaOrdemDefinida() {
        assertEquals("RELATORIO AMBIENTAL\nConsumo de agua: 1200 litros\nFim do relatorio", new RelatorioAgua(1200).gerar());
    }
    @Test void deveGerarRelatorioDeResiduosNaOrdemDefinida() {
        assertEquals("RELATORIO AMBIENTAL\nResiduos reciclados: 85 kg\nFim do relatorio", new RelatorioResiduos(85).gerar());
    }
    @Test void deveAceitarValoresZerados() {
        assertTrue(new RelatorioAgua(0).gerar().contains("0 litros"));
        assertTrue(new RelatorioResiduos(0).gerar().contains("0 kg"));
    }
    @Test void deveRejeitarValoresNegativos() {
        assertThrows(IllegalArgumentException.class, () -> new RelatorioAgua(-1));
        assertThrows(IllegalArgumentException.class, () -> new RelatorioResiduos(-1));
    }
}