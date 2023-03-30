import javax.swing.JDialog;

public class JanelaDialog {
    private JDialog janela;

    public JanelaDialog() {
        janela = new JDialog();
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        janela.setTitle("Título da janela");
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaDialog();
    }
}