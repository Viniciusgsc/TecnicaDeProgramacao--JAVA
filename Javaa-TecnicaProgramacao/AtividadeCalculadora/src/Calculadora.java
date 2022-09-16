import java.util.Scanner;
public class Calculadora {
    static public void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    Num n1=new Num();
    Num n2=new Num();
    Num res=new Num();
    Num resSub=new Num();
    Num resMulti=new Num();
    Num resDiv=new Num();
    
    //Digitar primeiro valor
    System.out.printf("%nDigite o primeiro valor: ");
    n1.setValor(scan.nextInt());
    //Digitar Segundo Valor 
    System.out.printf("%nDigite o segundo  valor: ");
    n2.setValor(scan.nextInt());
   
    //Operações
    res.setValor(n1.getValor() + n2.getValor());
    resSub.setValor(n1.getValor() - n2.getValor());
    resMulti.setValor(n1.getValor() * n2.getValor());
    resDiv.setValor(n1.getValor() / n2.getValor());
    
    //Adição
    System.out.printf("%nA soma de %d com %d é igual a: %d",n1.getValor(),n2.getValor(),res.getValor());
    //Subtração
    System.out.printf("%nA subtração de %d com %d é igual a: %d",n1.getValor(),n2.getValor(),resSub.getValor());
    //Multiplicação
    System.out.printf("%nA multiplicação de %d com %d é igual a: %d",n1.getValor(),n2.getValor(),resMulti.getValor());
    //Divisão
    System.out.printf("%nA Divisão de %d com %d é igual a: %d",n1.getValor(),n2.getValor(),resDiv.getValor());
}
}
