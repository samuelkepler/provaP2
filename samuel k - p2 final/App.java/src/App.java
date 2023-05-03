
import java.util.Scanner;

public class App {
        public static void main(String[] args) {
                Scanner ler = new Scanner(System.in);
                
                BancoPessoa joao = new BancoPessoa("Jõao Candido", 10586989, 0, 0, 0, 100);
                BancoPessoa luisa = new BancoPessoa( "luisa", 15876789, 0,0 ,0 , 100);
                
                 joao.transfBancaria();
                joao.imprimir();
                luisa.imprimir();

               
                luisa.transfBancaria();



                
                
                ler.close();

        }
}