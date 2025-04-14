public class TiposEVariaveis {
    public static void main(String[] args) throws Exception {
        byte b = 127;
        short s = 30000; // números inteiros de -32000 a 32000
        int i = 345345; // números inteiros extensos
        long l = 1234567877878L; // números muito extensos, aplica-se o L no final
        float f = 3.14f; // números com casas decimais, aplica-se o f ao final
        double d = 4.123445; // números com casas decimais extensos
        String nome = "Marcos Tulio"; // textos
        char c = 'A'; // caractere único, apenas um caractere entre aspas simples
        boolean verdade = true; // true ou false, verdadeiro ou faso, sim ou não
        String TiposVariaveis = "Tipos de Variáveis em Java: " + b + " / " + s + " / " + i + " / " + l + " / " + f + " / " + d + " / " + nome + " / " + c + " / " + verdade;
        System.out.println(TiposVariaveis);


        
    }
}
