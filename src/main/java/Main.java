import com.google.gson.Gson;

public class Main {
    public static void main(String[] args)
    {
        Book book = new Book("Tolkien", "Lord of the rings");

        Gson gson = new Gson();
        String bookJson = gson.toJson(book);

        System.out.println(bookJson);
        System.out.println("Test");

    }
}
