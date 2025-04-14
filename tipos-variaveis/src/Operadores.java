public class Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 15;
        String nome = "Marcos";
        String nome2 = "Marcos Tulio";


        boolean simNao = numero1 == numero2; // compara a igualdade entre as variaveis

        System.out.println("Numero 1 é igual ao numero 2? " + simNao);
        if(numero1 > numero2) {
            System.out.println("O Número 1 é maior que o número 2!");
           } else {
            System.out.println("O número 1 não é maior que o número 2!");
        }
        if (nome.equals(nome2)) {
            System.out.println("Os dois nomes são iguais!");
        } else {
            System.out.println("Os dois nomes são diferentes! " + nome + " é diferente de " + nome2);
        }
    }
}
