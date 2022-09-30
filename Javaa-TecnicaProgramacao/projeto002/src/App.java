import entidades.Cliente;
import entidades.Documento;
import entidades.Contato;
import entidades.Endereco;
import entidades.Funcionario;
import entidades.PessoaFisica;
import java.security.Permissions;
import java.time.LocalDate;


public class App {
    public static void main(String[] args) throws Exception {
        Documento documentoII = new Documento("777.777.777-77");
        documentoII.setCnh("487.747.741-47");
        documentoII.setRg("88.555.668-5");

        Contato contatoII = new Contato("antonio58745@gmail.com");
        contatoII.setCelular("(16)8855-9988");
        contatoII.setFixo("(16)744554-7777");
        contatoII.setEmail("antonio58745@gmail.com");


        Endereco enderecoII = new Endereco("14406-395");
        enderecoII.setBairro("Imperador");
        enderecoII.setCidade("Franca");
        enderecoII.setLogradouro("comercio");
        enderecoII.setNome("Rua do imperador");
        enderecoII.setNumero("9856");
        enderecoII.setUf("SP");

        Cliente clienteI = new Cliente();
        clienteI.setScoreCredito(5897);
        clienteI.setNome("antonio");
        clienteI.setDataNascimento(LocalDate.of(1980, 06, 17));
        clienteI.setEndereco(enderecoII);
        clienteI.setDocumento(documentoII);
        clienteI.setContato(contatoII);

        Endereco enderecoI = new Endereco("14486-344");
        enderecoI.setBairro("Planalto");
        enderecoI.setCidade("Franca");
        enderecoI.setLogradouro("avenida");
        enderecoI.setNome("Rua do planalto");
        enderecoI.setNumero("1987");
        enderecoI.setUf("SP");

        Documento documentoI = new Documento("888.888.888-88");
        documentoI .setCnh("777.666.444-98");
        documentoI .setRg("44.144.478-9");

        Contato cont1 = new Contato("jose@gmail.com");
        cont1.setCelular("16-555555555");
        cont1.setFixo("(16)3705-8954");

        Funcionario funcionarioI = new Funcionario();
        funcionarioI .setNome("Jose");
        funcionarioI .setDataNascimento(LocalDate.of(1975, 07, 20));
        funcionarioI .setMatricula("789");
        funcionarioI .setSalario(5000);
        funcionarioI .setDocumento(documentoI );
        funcionarioI .setEndereco(enderecoI);
        funcionarioI .setContato(cont1);

        System.out.println("---Cliente---");
        Util.info(clienteI);

        System.out.println("---Funcionario---");
        Util.info(funcionarioI);

      
    }
    
   

  


}
