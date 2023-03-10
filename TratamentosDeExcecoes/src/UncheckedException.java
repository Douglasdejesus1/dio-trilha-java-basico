import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inv?lida, informe um n?mero inteiro! " + e.getMessage());
                System.out.println("O c?digo continua...");
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Imposs?vel dividir um n?mero por 0.");
                System.out.println("O c?digo continua...");
            }
            finally {
                System.out.println("Chegou no finally!");
            }
        } while(continueLooping);


    }

    public static int dividir(int a, int b) {
        return a / b;
    }


}
