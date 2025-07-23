import java.io.*;
import java.net.*;

public class BookApiClient {

    private static final String API_URL = "https://dummyjson.com/products";

    // 1️⃣ GET request to fetch books
    public static void getBooks() {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int status = conn.getResponseCode();
            System.out.println("GET Status Code: " + status);

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            conn.disconnect();

            System.out.println("Books:\n" + content.toString());

        } catch (IOException e) {
            System.out.println("Error fetching books: " + e.getMessage());
        }
    }

    // 2️⃣ POST request to create a new book
    public static void createBook(Book book) {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // Convert book to JSON manually
            String jsonInputString = String.format("{\"title\":\"%s\",\"author\":\"%s\"}",
                    book.title, book.author);

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int status = conn.getResponseCode();
            System.out.println("POST Status Code: " + status);

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            StringBuilder response = new StringBuilder();
            String resLine;

            while ((resLine = in.readLine()) != null) {
                response.append(resLine.trim());
            }

            System.out.println("Response:\n" + response.toString());

            conn.disconnect();

        } catch (IOException e) {
            System.out.println("Error creating book: " + e.getMessage());
        }
    }

    // 3️⃣ Main method
    public static void main(String[] args) {
        System.out.println("📖 Getting all books...");
        getBooks();

        System.out.println("\n📝 Creating new book...");
        Book newBook = new Book("Java Mastery", "Alice Developer");
        createBook(newBook);
    }

    // ✅ Static inner class
    static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
