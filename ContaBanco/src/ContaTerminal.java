import java.util.Scanner;
public class ContaTerminal{


  public static void main(String[]args)thows Exception{
        

    Scanner ler = new Scanner(System.in);

    //Variaveis
    int numero;
    String agencia, nomeCliente;
    double saldo;
    
    //Nome do cliente
    System.out.println("Por favor,digite nome do cliente: ");
    nomeCliente = ler.nextLine();

    //Numero da agência cliente
    System.out.println("Por favor,digite o número da Agência!");
    agencia = ler.next();

    //Número da conta
    System.out.println("Por favor, digite o número da Conta:");
    numero= ler.nextInt();


    //Exibir saldo
    System.out.println("Por favor digite, seu saldo");
    saldo = ler.nextDouble();

    
     //Exibir a mensagem conta criada
     System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");      
}
}
