package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;


public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 =
                new Cliente("Kirin", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 =
                new Cliente("Akira",TipoCliente.PESSOA_JURIDICA, TipoPagamento.A_VISTA);


        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.A_VISTA.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorRelatorio("aaaa");
        System.out.println(tipoCliente2);


    }
}
