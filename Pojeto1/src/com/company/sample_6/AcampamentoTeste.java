import java.util.Scanner;

public class Acampamentoteste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        membro.nome = sc.nextLine();
        System.out.println("Digete a idade: ");
        membro.idade = Integer.parseInt(sc.nextLine());
        membro.imprimir();
        membro.separarGrupo();
        membro.imprimir();
    }
}
