public class Main {


    public static void main(String[] args) {
        Author author = new Author("Джон", "Толкин");
        Author author1 = new Author("Стивен", "Кинг");
        Book book = new Book("Властелин колец", author, 1954);
        Book book1 = new Book("Зеленая миля", author1, 1996);
        book.setYear(1955);
        System.out.println("Название книги - " +book.getName());
        System.out.println("Автор - " +author.getFirstName()+ " " +author.getLastName());
        System.out.println("Год издания - " +book.getYear());
        System.out.println("Название книги - " +book1.getName());
        System.out.println("Автор - " +author1.getFirstName()+ " " +author1.getLastName());
        System.out.println("Год издания - " +book1.getYear());
        System.out.println(author);
        System.out.println(book);
        System.out.println(author1);
        System.out.println(book1);
        System.out.println(author.equals(author1));
        System.out.println(book.equals(book1));
        System.out.println(author.hashcode());
        System.out.println(book.hashCode());
        System.out.println(author1.hashcode());
        System.out.println(book1.hashCode());
    }
}