import java.util.Scanner;

public class Main1 {

    public static void main(String[] args){
        Scanner meuObj=new Scanner(System.in);
        System.out.println("Entre com o número:");
        double valor1=meuObj.nextDouble();
        double f = valor1;
        while (valor1 > 1){ 
            f = f *(valor1 - 1);
            valor1--;

    }
    System.out.println(f);
    meuObj.close();
}
}