package principal;

import javax.swing.JOptionPane;

import triangulo.Triangulo;

public class Principal {

    public static void main(String[] args) {

        String opcao = "";
        Triangulo tri = new Triangulo();
        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura dos lados \n2 - É triângulo \n3 - Tipo Triângulo \n9 - Sair");
            switch (Integer.parseInt(opcao)) {
                case 1:
                    tri.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a")));
                    tri.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor b")));
                    tri.setValorC(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor c")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "É triângulo: " + tri.eTriangulo());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Tipo triângulo: " + tri.getTipo());
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Alternativa inválida!");
                    break;
            }
        }
    }
}
