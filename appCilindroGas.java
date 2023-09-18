import java.util.Scanner;
import java.util.ArrayList;

public class appCilindroGas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // criando uma lista com objetos do tipo CilindroGas dentro
        ArrayList<CilindroGas> cilindros = new ArrayList<>();
        CilindroGas cilindroUm = new CilindroGas(0001, 50); // 0
        CilindroGas cilindroDois = new CilindroGas(0002, 60); // 1
        CilindroGas cilindroTres = new CilindroGas(0003, 70); // 2
        // add objetos na lista de array
        cilindros.add(cilindroUm);
        cilindros.add(cilindroDois);
        cilindros.add(cilindroTres);
        // PODE SER FEITO DIRETO:
        // cilindros.add(new CilindroGas(0001, 50));
        // cilindros.add(new CilindroGas(0002, 60););
        // cilindros.add(new CilindroGas(0003, 70));

        // registrando o consumo do primeiro array (cilindro)
        System.out.print("Digite o consumo do primeiro cilindro: ");
        cilindros.get(0).registrarConsumo(sc.nextFloat());

        System.out.print("Digite o consumo do primeiro cilindro: ");
        cilindros.get(0).registrarConsumo(sc.nextFloat());

        // registrando o consumo do segundo array (cilindro)
        System.out.print("Digite o consumo do segundo cilindro: ");
        cilindros.get(1).registrarConsumo(sc.nextFloat());

        System.out.print("Digite o consumo do segundo cilindro: ");
        cilindros.get(1).registrarConsumo(sc.nextFloat());

        System.out.print("Digite o consumo do segundo cilindro: ");
        cilindros.get(1).registrarConsumo(sc.nextFloat());

        for (int i = 0; i < cilindros.size(); i++) {
            System.out.println("ID: " + cilindros.get(i).getIdCilindro());
            System.out.println("Capacidade Atual: "+ cilindros.get(i).getCapacidadeAtual());
            System.out.println("Ultimo consumo: " + cilindros.get(i).getQtdeUltimoConsumo());
        }

        System.out.println("Total: " + (cilindros.get(0).getCapacidadeAtual() + cilindros.get(1).getCapacidadeAtual() + cilindros.get(2).getCapacidadeAtual()));

    }
}