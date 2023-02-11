import javax.swing.JOptionPane;

public class Media {

    public static void main(String[] args) {
        Calculo calculo = new Calculo();
        System.out.println(calculo.media);

        JOptionPane.showMessageDialog(null, calculo.media, "Resultado Média 4 notas", JOptionPane.WARNING_MESSAGE);
    }

}
