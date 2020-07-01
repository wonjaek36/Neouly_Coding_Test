import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Main {

    public String ip;
    public Integer port;
    public String dbName;
    MongoClient mongoClient;
    MongoDatabase mongoDatabase;
    MongoCollection<Document> collection;

    public Main(String ip, Integer port, String dbName) {

        this.ip = ip;
        this.port = port;
        this.dbName = dbName;

        //TODO Connect localhost, mongodb port(27017)
        this.mongoClient = new MongoClient();
    }

    public void getCollection(String collName) {

        //TODO Get Mongodb Database
        this.mongoDatabase = null;
        this.collection = mongoDatabase.getCollection(collName);
    }

    public Double getAverageByte() {

        //TODO using collection.find
        MongoCursor<Document> cursor = null;

        try {
            //TODO Check cursor has next item
            while ( ) {
                Document document = cursor.next();
            }
        } finally {

            cursor.close();
        }

        return 0.0;
    }

    public static void main(String[] args) {

        Main main = new Main("localhost", 27017, "config");
        main.getCollection("data");
        main.getAverageByte();
    }

}
