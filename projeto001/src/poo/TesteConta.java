package poo;

import javax.swing.JOptionPane;

public class TesteConta {
     public static void main(String[] args) {
        Conta objCC = new Conta();
        Conta objCP = new Conta();

        objCC.setNumero = (numero:123);
        objCC.setSaldo = (saldo:2000);

        objCP.setNumero = (numero:321);
        objCP.setSaldo = (sal:5000);

        System.out.println(objCC.info());
        JOptionPane.showMessageDialog(null,objCP.info());

        System.out.println("----------REFERENCIA-----------");
        System.out.println(objCC);
        System.out.println(objCP);

    }
    
    
}
