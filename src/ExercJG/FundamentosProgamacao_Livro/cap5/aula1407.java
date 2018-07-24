package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class aula1407 {

    public static void main(String[] args) {

        String login = "";
        String senha = "";

        while (!login.equals("alex") && !senha.equals("123")) {
            for (int i = 1; i < 4; i++) {
                login = JOptionPane.showInputDialog("Entre com seu login:\nTentativa: " + i);
                senha = JOptionPane.showInputDialog("Entre com a senha:");
                if (login.equals("alex") && senha.equals("123")) {
                    JOptionPane.showMessageDialog(null, "Login e senha corretos", "GUANABARA", 1);
                    System.exit(0);
                }
            }
            JOptionPane.showMessageDialog(null, "Login e senha incorretos!\nTente novamente mais tarde..", "GUANABARA", 0);
            System.exit(0);
        }
    }
}
