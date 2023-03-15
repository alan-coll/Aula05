import java.util.Scanner;
public class Exercicio3 {
  public static void main(String[] args) {
    Scanner ler= new Scanner(System.in);
    System.out.print("Salario: ");
    double salario=ler.nextDouble();
    System.out.print("Percentual de reajuste:  ");
    double reajuste=ler.nextDouble();
    double novoSalario=salario+ (salario*reajuste/100);
    System.out.printf("Novo Salario = R$ %.2f \n",novoSalario);

  }
}