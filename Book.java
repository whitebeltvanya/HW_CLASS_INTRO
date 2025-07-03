public class Book {

    final static int BIG_BOOK_PAGES = 500;
    final static int PRICE_PER_PAGE = 3;
    final static int MIN_PRICE_LIMIT = 250;
    final static String CURRENCY = "RUB";

    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book(String title, int releaseYear, String authorName,
                String authorSurName, int authorRating, int pages) {
        this.title = title;
        this.releaseYear = Math.abs(releaseYear);
        this.author = new Author(authorName, authorSurName, authorRating);
        this.pages = Math.max(pages, 1);
    }

    public boolean isBig() {
        return pages >= BIG_BOOK_PAGES;
    }

    public boolean matches(String word) {
        return (title.contains(word) || author.matches(word));
    }

    public int estimatePrice() {
        int price = pages * PRICE_PER_PAGE * (int) Math.floor(Math.sqrt(author.rating));
        return Math.max(price, MIN_PRICE_LIMIT);
    }

    @Override
    public String toString() {
        return String.format("Автор: \"%s %s\", Название: \"%s\", Год: %d, Страниц: %d, Рейтинг: %d/%d, Цена: %d %s.",
                author.name, author.surname, title, releaseYear, pages, author.rating,
                author.maxRating, estimatePrice(), CURRENCY);
    }
}
