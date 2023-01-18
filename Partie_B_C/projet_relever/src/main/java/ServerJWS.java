import jakarta.xml.ws.Endpoint;
import org.example.ReleverService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9191/", new ReleverService());
    }
}
