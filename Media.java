import javax.swing.JOptionPane;

public class Media {

    public static void main(String[] args) {
        // criação de objeto
        Calculo calculo = new Calculo();
        // apresentação no terminal
        System.out.println(calculo.media);

        // mensagem na tela
        JOptionPane.showMessageDialog(null, calculo.media, "Resultado Média 4 notas", JOptionPane.WARNING_MESSAGE);
    }

}
