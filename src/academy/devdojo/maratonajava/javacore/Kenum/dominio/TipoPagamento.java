package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento{
        CREDITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        },
        DEBITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        },
        A_VISTA{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.12;
            }
        };

        public double calcularDesconto(double valor){
            return 0;

        }
    }