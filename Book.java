public class Book {

    final static int BIG_BOOK_PAGES = 500;
    final static int PRICE_PER_PAGE = 3;
    final static int MIN_PRICE_LIMIT = 250;
    final static String CURRENCY = "RUB";

    public String title;
    public int releaseYear;
    public String author;
    public int pages;

    public Book (String title, int releaseYear, String author,int pages){
        this.title = title;
        this.releaseYear = Math.abs(releaseYear);
        this.author = author;
        this.pages  = Math.abs(pages);
    }

    public boolean isBig(){
        return pages >= BIG_BOOK_PAGES;
    }

    public boolean matches(String word){
        return (title.contains(word) || author.contains(word));
    }

    public int estimatePrice(){
        int price = pages*PRICE_PER_PAGE;
        price = Math.max(price, MIN_PRICE_LIMIT);
        return price;
    }

    @Override
    public String toString() {
        return String.format("Автор: \"%s\", Название: \"%s\", Год: %d, Страниц: %d, Цена: %d %s.",
                             author, title, releaseYear, pages, estimatePrice(), CURRENCY);
    }
}
