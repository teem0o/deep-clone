import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("temo",27, List.of("book1", "book2", "book3"));
        Man manCopy = CopyUtils.deepCopy(man);
        System.out.println(man == manCopy);
    }
}
