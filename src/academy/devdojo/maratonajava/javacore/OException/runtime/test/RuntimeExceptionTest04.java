package academy.devdojo.maratonajava.javacore.OException.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

//Tratamento de multiplas exceções
// O tipo mais generico de exceções sempre vai por ultimo
public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        try {
            throw  new RuntimeException();

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
