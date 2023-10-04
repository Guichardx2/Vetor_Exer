import java.util.Scanner;
import java.util.ArrayList;
public class arryOpc {
    ArrayList<Integer> valor = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    //int [] valor = new int[7];

    //int i = 0;
    int num= 0;
    int opcao = 0;
    void textoMenu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Inserir");
        System.out.println("2 - Pesquisar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Imprimir");
        System.out.println("0 - Encerrar o programa");
        System.out.print("Digite a opção desejada: ");
    }
    void mostrar() {
        System.out.println("Seu vetor: " + valor);
    }
    void menu(){
        textoMenu();
        opcao = scan.nextInt();
        if (opcao == 1){
            inserir();
        }
        else if (opcao == 2){
            pesquisar();
        }
        else if (opcao == 3){
            excluir();
        }
        else if (opcao == 4){
            imprimir();
        }
        else if (opcao == 0){
            System.out.println("Foi bom ter você por aqui, Obrigado por usar!");
            System.exit(0);
        }
        else {
            System.out.println("Digite uma opção valida!");
            System.out.println("                        ");
            menu();
        }
    }
    void inserir() {
        //Menu do inserir
        System.out.println("==================================================");
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("1 - Inserir na ultima posição livre");
        System.out.println("2 - Inserir em uma posição escolhida"); //fazer a opção de inserir uma posição escolhida
        System.out.println("0 - Voltar ao menu\n");
        System.out.print("Digite a opção desejada: ");
        opcao = scan.nextInt();
        System.out.println("==================================================\n");

        //Inserir na última posição
        if (opcao == 1) {
            System.out.println("Escolha as opções abaixo: ");
            System.out.println("1 - Inserir");
            System.out.println("0 - Voltar ao menu\n");
            System.out.print("Digite a opção desejada: ");
            opcao= scan.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor desejado para a última posição livre: ");
                num = scan.nextInt();
                valor.add(num);
                System.out.println("Valor inserido!");
                inserir();
            } else if (opcao == 0) {
                System.out.println("Voltando ao menu...");
                inserir();
            }
            inserir();
        }
        //Escolher a posição do número para inserir
        else if (opcao == 2) {
            //System.out.println("                   " );
            System.out.println("Sua lista de valores: ");
            System.out.println("-------------------------------------------------");
            System.out.println(valor);
            System.out.println("-------------------------------------------------");

            System.out.println("Escolha as opções abaixo: ");
            System.out.println("1 - Inserir");
            System.out.println("0 - Voltar ao menu\n");
            System.out.print("Digite a opção desejada: ");
            opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("==================================================");
                System.out.print("Escolha uma posição existente para colocar o numero: ");
                int pos = scan.nextInt();
                System.out.print("Digite o novo número para substituir: ");
                num = scan.nextInt();
                valor.set(pos,num);
                System.out.println("O valor foi inserido: " + valor);
            } else if (opcao == 0) {
                System.out.println("==================================================");
                System.out.println("Voltando ao menu...");
                inserir();
            }
            inserir();
        } else if (opcao == 0) {
            System.out.println("==================================================");
            System.out.println("Voltando ao menu...");
            menu();
        }
        else {
            System.out.println("Digite uma opção valida!");
            System.out.println("                        ");
            inserir();
        }
    }
    void pesquisar() {
        System.out.println("==================================================");
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("1 - Pesquise o número ");
        System.out.println("2 - Pesquise a posição ");
        System.out.println("0 - Votar ao menu");
        System.out.print("Digite a opção desejada: ");
        opcao = scan.nextInt();
        System.out.println("==================================================");
        if (opcao == 1){
            System.out.print("Escolha um número para pesquisar: ");
            num= scan.nextInt();
            for (int element : valor) {
                if (num == element){
                    System.out.println("O elemento "+ num + "existe no vetor");
                } else{
                    System.out.println("Infelizmente não existe esse número no nosso array");
                    pesquisar();
                }
            }
            pesquisar();
        }
        else if (opcao == 2){
            System.out.println("==================================================");
            System.out.print("Digite a posição desejada: ");
            int pos = scan.nextInt();
            if (pos <= valor.size()){
                System.out.println("O valor da posição " + pos + " é " + valor.get(pos));
            }
            else{
                System.out.println("A posição informada não existe ");
                pesquisar();
            }
            pesquisar();
        }
        else if (opcao == 0){
            System.out.println("Voltando ao menu...");
            menu();
        }
        else {
            System.out.println("Digite uma opção valida!");
            System.out.println("                        ");
            pesquisar();
        }
    }
    void excluir(){
        System.out.println("==================================================");
        System.out.println("Escolhe como deseja excluir o elemento: ");
        System.out.println("1 - Excluir pelo número");
        System.out.println("2 - Excluir pela posição");
        System.out.println("0 - Voltar ao menu");
        System.out.print("Digite a opção desejada: ");
        opcao= scan.nextInt();
        if (opcao == 1){
            System.out.println("------------------------------------------------");
            mostrar();
            System.out.println("------------------------------------------------");

            System.out.println("Digite o número que deseja excluir: ");
            num= scan.nextInt();
            for (int element : valor) {
                if(element == num){
                    valor.remove(Integer.valueOf(num));
                    System.out.println("Número excluído com sucesso!");
                    System.out.println(valor);
                    excluir();
                }
            }
            excluir();
        } else if (opcao == 2) {
            System.out.println("------------------------------------------------");
            System.out.println(valor);
            System.out.println("------------------------------------------------");
            System.out.print("Escolha a posição que deseja excluir: ");
            int pos = scan.nextInt();
            if (pos <= valor.size()){
                valor.remove(pos);
                System.out.println("Número excluído com sucesso!");
            }else {
                System.out.println("O vetor não possuí esta posição!");
                excluir();
            }
            excluir();
        } else if (opcao == 0){
            System.out.println("Voltando...");
            menu();
        }
        else {
            System.out.println("Digite uma opção valida!");
            System.out.println("                        ");
            excluir();
        }
    }
    void imprimir () {
        System.out.println("==================================================");
        System.out.println("Escolhe como deseja excluir o elemento: ");
        System.out.println("1 - Imprimir o array");
        System.out.println("0 - Voltar ao menu");
        System.out.print("Digite a opção desejada: ");
        opcao= scan.nextInt();
        System.out.println("==================================================");

        if (opcao == 1) {
            System.out.println("---------------------------------------------------");
            System.out.println(valor);
            System.out.println("----------------------------------------------------");
        }
        else if (opcao == 0){
            System.out.println("Voltando...");
            menu();
        }
        else {
            System.out.println("Digite uma opção valida!");
            System.out.println("                        ");
            imprimir();
        }
    }
}
