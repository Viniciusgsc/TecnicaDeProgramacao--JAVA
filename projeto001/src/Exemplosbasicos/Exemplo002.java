package Exemplosbasicos;
public class Exemplo002 {
    int soma(int a, int b){
        return a+b;
    }

    int subtracao(int a, int b){
        return a-b;
    }

    
    public static void main(String[] args) {
        Exemplo002 obj = new Exemplo002();
        int resultado = obj.soma(2, 5);
        System.out.println(resultado);

        new Exemplo002();
        int resultado2 = obj.subtracao(2, 5);
        System.out.println(resultado2);

    }
}

    

