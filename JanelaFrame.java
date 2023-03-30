import javax.swing.JFrame;

public class JanelaFrame {
    private JFrame janela;

    public JanelaFrame() {
        janela = new JFrame();
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Título da janela");
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaFrame();
    }
}