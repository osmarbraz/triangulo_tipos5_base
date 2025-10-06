package triangulo;

public class Triangulo {

    private double valorA;
    private double valorB;
    private double valorC;

    /**
     * Construtor sem argumento.
     */
    public Triangulo() {
        this(0.0, 0.0, 0.0);
    }

    /**
     * Construtor com argumento.
     *
     * @param valorA Um valor real.
     * @param valorB Um valor real.
     * @param valorC Um valor real.
     */
    public Triangulo(double valorA, double valorB, double valorC) {
        setValorA(valorA);
        setValorB(valorB);
        setValorC(valorC);
    }

    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public double getValorC() {
        return valorC;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    public void setValorC(double valorC) {
        this.valorC = valorC;
    }

    /**
     * Verifica se os lados formam um triângulo.
     *
     * @return Um lógico se é ou não um triângulo
     */
    public boolean eTriangulo() {
       
       return false; //Não é triângulo       
    }

    /**
     * Retorna o tipo do triângulo
     *
     * @return Um string com tipo do triângulo
     */
    public String getTipo() {        
        return "Não é triângulo";        
    }
 }
