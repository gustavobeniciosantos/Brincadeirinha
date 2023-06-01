import java.util.*;
public class Operation {

    Scanner read = new Scanner(System.in);

    Front front = new Front();
    ArrayList<Data> client= new ArrayList<>();
    boolean rep = true;
    public Operation(){

        while (rep){
            int option = front.menu();

            switch (option){
                case 1:

                    write("Digite o nome");
                    String name = read.next();
                    write("Digite o email");
                    String email = read.next();
                    write("Digite o código de rastreio");
                    String trackingCode = read.next();
                    addClient(name,email, trackingCode,client);

                    break;

                case 2:
                    for(int i = 0; i < client.size();i++){
                        write("");
                        write("Nome: "+client.get(i).getName());
                        write("Email: "+client.get(i).getEmail());
                        write("Cod. Rastreio: "+client.get(i).getTrackingCode());
                        write("");
                        write("");
                        write("");
                    }
                    break;

                case 3:
                    write("Enviado para os clientes com sucesso!");
                    rep = false;
                    break;
                case 0:
                    rep = false;
                    break;
            }//swtich

        }//while


    }


    public void addClient(String name, String email, String trackingCode, ArrayList<Data>gift){

        Data client = new Data();

        client.setEmail(email);
        client.setName(name);
        client.setTrackingCode(trackingCode);
        gift.add(client);

    }




    public void write(String text){
        System.out.println(text);
    }


}
