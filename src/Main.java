import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Document> docs = new ArrayList<>();
        docs.add(new Document(1, "Счет 1"));
        docs.add(new Document(2, "Счет 2"));
        docs.add(new Document(3, "Счет 3"));

        docs.add(1, new Document(4, "Счет 4"));

        Document doc5 = new Document(5, "Счет 5");
        docs.set(2, doc5);

        docs.remove(0);
        //docs.remove(doc5);

        int doc5Indx = docs.indexOf(doc5);
        System.out.println(doc5Indx);

        printDocuments(docs);
    }

    static void printDocuments(List<Document> documents) {
        for (int i = 0; i < documents.size(); i++) {
            Document doc = documents.get(i);
            System.out.println(doc);
        }
    }
}