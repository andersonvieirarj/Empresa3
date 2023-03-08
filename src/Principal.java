import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //Funcionario func = new Funcionario();


        Scanner leitura = new Scanner(System.in);

        int op=0;
        while (op != 4) {
        System.out.println("Qual opção você deseja?");
        System.out.println("1-Gerente \n2-Administrativo\n" +
                "3-Estagiario \n4-Sair \n");
        op = Integer.parseInt(leitura.nextLine());
        if (op==1){
            Gerente g = new Gerente();
            System.out.println("Informe o seu nome: ");
            g.setNome(leitura.nextLine());
            System.out.println("Informe seu bairro: ");
            g.setBairro(leitura.nextLine());
            System.out.println("Informe sua idade: ");
            g.setIdade(Integer.parseInt(leitura.nextLine()));
            System.out.println("Informe quantas horas foram trabalhadas: ");
            g.setHorasTrab(Integer.parseInt(leitura.nextLine()));
            System.out.println("Informe quantas horas extras foram trabalhadas: ");
            g.setHorasMais(Integer.parseInt(leitura.nextLine()));

            System.out.println("Funcionário: " + g.getNome() +
                    "\nHoras Trabalhadas a mais: " + g.calcularHoras());
        }
     else if (op==2){
         Administrativo adm = new Administrativo();
            System.out.println("Informe o seu nome: ");
            adm.setNome(leitura.nextLine());
            System.out.println("Informe seu bairro: ");
            adm.setBairro(leitura.nextLine());
            System.out.println("Informe sua idade: ");
            adm.setIdade(Integer.parseInt(leitura.nextLine()));
            System.out.println("Informe quantas horas foram trabalhadas: ");
            adm.setHorasTrab(Integer.parseInt(leitura.nextLine()));
            System.out.println("Informe quantas horas extras foram trabalhadas: ");
            adm.setHorasExt(Integer.parseInt(leitura.nextLine()));
            System.out.println("Informe o valor da hora: ");
            adm.setValorHora(Integer.parseInt(leitura.nextLine()));

            System.out.println("Funcionario: " + adm.getNome() +
                    "Salário: " + adm.calcularSalario() + "\n");

        } else if (op == 3) {
            Estagiario est = new Estagiario ();
            System.out.println("Informe o seu nome: ");
            est.setNome(leitura.nextLine());
            System.out.println("Informe seu bairro: ");
            est.setBairro(leitura.nextLine());
            System.out.println("Informe sua idade: ");
            est.setIdade(Integer.parseInt(leitura.nextLine()));
            System.out.println("Informe quantas horas foram estagiadas: ");
            est.setHorasEst(Integer.parseInt(leitura.nextLine()));
            System.out.println("Informe quantos meses você estagiou: ");
            est.setMesesEst(Integer.parseInt(leitura.nextLine()));

            System.out.println("Funcionario: " + est.getNome() +
                    "Total de Horas: " + est.calcularHorasEst() + "\n");

     }
     else {
            System.out.println("Opção Inválida!");
        }

    }
    }
}