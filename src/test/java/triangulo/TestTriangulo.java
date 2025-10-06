package triangulo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTriangulo {
   
    @Test
    void testETriangulo() {
        Triangulo equacao = new Triangulo(2.0, 2.0, 3.0);
        boolean retornoEsperado = true;
        boolean retornoFeito = equacao.eTriangulo();
        assertEquals(retornoEsperado, retornoFeito);
    }
    
    @Test
    void testNaoETrianguloNegativo() {
        Triangulo equacao = new Triangulo(-1.0, 2.0, 3.0);
        boolean retornoEsperado = false;
        boolean retornoFeito = equacao.eTriangulo();
        assertEquals(retornoEsperado, retornoFeito);
    }
    
    @Test
    void testNaoETriangulo() {
        Triangulo equacao = new Triangulo(2.0, 3.0, 6.0);
        boolean retornoEsperado = false;
        boolean retornoFeito = equacao.eTriangulo();
        assertEquals(retornoEsperado, retornoFeito);
    }
    
    @Test
    void testGetTipoEquilatero() {
        Triangulo equacao = new Triangulo(2.0, 2.0, 2.0);
        String retornoEsperado = "Equilátero";
        String retornoFeito = equacao.getTipo();
        assertEquals(retornoEsperado, retornoFeito);
    }
    
    @Test
    void testGetTipoIsoceles() {
        Triangulo equacao = new Triangulo(2.0, 2.0, 3.0);
        String retornoEsperado = "Isóceles";
        String retornoFeito = equacao.getTipo();
        assertEquals(retornoEsperado, retornoFeito);
    }
    
    @Test
    void testGetTipoEscaleno() {
        Triangulo equacao = new Triangulo(3.0, 4.0, 5.0);
        String retornoEsperado = "Escaleno";
        String retornoFeito = equacao.getTipo();
        assertEquals(retornoEsperado, retornoFeito);
    }
   
}