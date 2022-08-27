package poo;

public class Conta {
    //atributos => caracteristicas
    private int numero;
    private double saldo;
    // comportamentos => metodos
    // tipo retorno nome_metodo(parametros) 
    String info(){
        String estado = "Numero:" + numero +
                        "\nSaldo:R$" + saldo;
        return estado;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
  
    

  
