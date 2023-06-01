import java.util.*;
public class Front {
    Scanner read = new Scanner(System.in);
    public int menu(){
        write("1. Cadastrar recebedor");
        write("2. Listar recebedores");
        write("3. Enviar");
        write("0. Sair");

        return read.nextInt();
    }

    public void write(String text){
        System.out.println(text);
    }
}
