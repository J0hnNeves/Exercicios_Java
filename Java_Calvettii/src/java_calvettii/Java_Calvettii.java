package java_calvettii;
import javax.swing.JOptionPane;

public class Java_Calvettii{ 
    public static void main(String[] args){
        //Declaração de variaveis e a entrada de dados 
        String a = JOptionPane.showInputDialog(null, "Digite a primeira palavra: ");
        String b = JOptionPane.showInputDialog(null, "Digite a segunda palavra: ");
        String c = JOptionPane.showInputDialog(null, "Digite a terceira palavra: ");
        //Saida de Dados 
        JOptionPane.showMessageDialog(null, "terceira palavra: " + c );
        JOptionPane.showMessageDialog(null, "segunda palavra: " + b);  
        JOptionPane.showMessageDialog(null, "primeira palavra: " + a);
    }
    public static void e02(String[] args){    
        //Declaração de variaveis e a entrada de dados 
        String numberString = JOptionPane.showInputDialog(null, "Digite um numero inteiro: ");     
        //Conversão de String para Int
        int numberInt = Integer.parseInt(numberString);     
        //Saida de dados 
        JOptionPane.showMessageDialog(null, "o numero digitado foi: " + numberInt);
    } 
    public static void ex03 (String[] args){
        //Declaração de variaveis e a entrada de dados
        String sDia = JOptionPane.showInputDialog(null, "Digite o dia: ");      
        String sMes = JOptionPane.showInputDialog(null, "Digite o mês: ");     
        String sAno = JOptionPane.showInputDialog(null, "Digite o ano: ");     
        //Saida de dados
        JOptionPane.showMessageDialog(null, "A data digitada foi: " +sDia +"/" +sMes +"/" +sAno);
    }
    public static void ex04(String[] args){
        //Declaração de variaveis e a entrada de dados 
        String sPeso = JOptionPane.showInputDialog(null, "Digite seu peso no formato real: ");
        //Conversão de String para Double
        double peso = Double.parseDouble(sPeso);
        //Mostrando o resultado
        JOptionPane.showMessageDialog(null, "O peso informado foi: " + peso + "kg");
    }
    public static void ex05(String[] args){
        String c1 = JOptionPane.showInputDialog(null, "Digite um carácter: ");
        String c2 = JOptionPane.showInputDialog(null, "Digite um carácter: ");
        String c3 = JOptionPane.showInputDialog(null, "Digite um carácter: ");
        String c4 = JOptionPane.showInputDialog(null, "Digite um carácter: ");
        String c5 = JOptionPane.showInputDialog(null, "Digite um carácter: ");
        String c6 = JOptionPane.showInputDialog(null, "Digite um carácter: ");
        String c7 = JOptionPane.showInputDialog(null, "Digite um carácter: ");
        String c8 = JOptionPane.showInputDialog(null, "Digite um carácter: ");
        String c9 = JOptionPane.showInputDialog(null, "Digite um carácter: ");
        String c10 = JOptionPane.showInputDialog(null, "Digite um carácter: ");
        JOptionPane.showMessageDialog(null, c1+c2+c3+c4+c5+c6+c7+c8+c9+c10);
    }
    public static void ex06(String[] args){
        /*//Leitura dos dígitos como caracteres (strings de 1 caracter)
        String milhar = JOptionPane.showInputDialog(null, "Digite o dígito do milhar: ");
        String centena = JOptionPane.showInputDialog(null, "Digite o dígito da centena: ");
        String dezena = JOptionPane.showInputDialog(null, "Digite o dígito da dezena: ");
        String unidade = JOptionPane.showInputDialog(null, "Digite o dígito da unidade: ");
        //Verifica se todos as entradas têm apenas 1 caracter e são dígitos
        if (milhar.length() == 1 && centena.length() == 1 &&
            dezena.length() == 1 && unidade.length() == 1 &&
            Character.isDigit(milhar.charAt(0)) &&
            Character.isDigit(centena.charAt(0)) &&
            Character.isDigit(dezena.charAt(0)) &&
            Character.isDigit(unidade.charAt(0))) {
            //Concatenação para formar o número em string
            String number = "" + milhar + centena + dezena + unidade;
            //Saida de dados
            JOptionPane.showMessageDialog(null, "Número formado: " + number);
        } else {
            //Mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro: Digite apenas 1 dígito numérico por vez.");
        }*/
        
        //Declaração de variaveis e entrada de dados
        String milharStr = JOptionPane.showInputDialog(null, "Digite o milhar: ");
        String centenaStr = JOptionPane.showInputDialog(null, "Digite a centena: ");
        String dezenaStr = JOptionPane.showInputDialog(null, "Digite a dezena: ");
        String unidadeStr = JOptionPane.showInputDialog(null, "Digite a unidade: ");
        //Convertendo de String para char
        char milhar = milharStr.charAt(0);
        char centena = centenaStr.charAt(0);
        char dezena = dezenaStr.charAt(0);
        char unidade = unidadeStr.charAt(0);
        //Concatenando os caracteres 
        String number = "" + milhar + centena + dezena + unidade;
        //Saida de dados
        JOptionPane.showMessageDialog(null, "Número formado: " + number);
    }
}

