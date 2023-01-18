import proxy.Relever;
import proxy.ReleverService;
import proxy.ReleverWS;

public class ClientWS {
    public static void main(String[] args) {
        ReleverService stub = new ReleverWS().getReleverServicePort();
        Relever relever = stub.getRelever("2334332345");
        System.out.println("--------------Relever------------");
        System.out.println(relever.getRib());
        System.out.println(relever.getOperations());
        System.out.println(relever.getSolde());
        //System.out.println("Liste des operations : \n");
        //System.out.println(relever.getOperations());
    }
}
