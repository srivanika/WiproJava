package Arrays.miniProject1.oops.encapsulation;

public class BookDemo {

    public static void main(String[] args) {

        Author author = new Author(
                "Chetan Bhagat",
                "chetan@gmail.com",
                'M');

        Book book = new Book(
                "Half Girlfriend",
                author,
                450.0,
                20);

        System.out.println("Book Name      : " + book.getName());
        System.out.println("Author Name    : " + book.getAuthor().getName());
        System.out.println("Author Email   : " + book.getAuthor().getEmail());
        System.out.println("Author Gender  : " + book.getAuthor().getGender());
        System.out.println("Book Price     : " + book.getPrice());
        System.out.println("Quantity Stock : " + book.getQtyInStock());
    }
}