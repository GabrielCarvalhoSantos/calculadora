package calculadora;

public class Validação {
    public  static  void  validar ( double  num2 , int  operacao ){
        if ( num2 == 0 && operacao == 4 ){
            throw  new  RuntimeException ( "Divisão não pode ser feita por 0" );
        }

    }
}
