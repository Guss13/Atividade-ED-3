import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha l1 = new Pilha();

        System.out.println("Digite os elementos da pilha:");
        for(int i = 1; i < 6; i++){
            l1.insere(sc.nextInt());
        }

        System.out.printf("%nImprimindo ultimo elemento da pilha%n", l1.tamanho());
        System.out.println(l1.top());

        System.out.println();
        System.out.println("Removendo ultimo elemento... ");
        l1.remove();

        System.out.printf("%nImprimindo ultimo elemento da pilha%n", l1.tamanho());
        System.out.println(l1.top());


        sc.close();
    }
}

