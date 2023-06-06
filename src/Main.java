import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Document> docs = new ArrayList<>();
        docs.add(new Document(1, "Счет 1"));
        docs.add(new Document(2, "Счет 2"));

        printDocuments(docs);
    }

    static void printDocuments(List<Document> documents) {
        for (int i = 0; i < documents.size(); i++) {
            Document doc = documents.get(i);
            System.out.println(doc);
        }
    }
}