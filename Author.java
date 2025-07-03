public class Author {
    public int maxRating = 0;

    String name;
    String surname;
    int rating;

    public Author(String name, String surname, int rating) {
        this.name = name;
        this.surname = surname;
        this.rating = Math.max(rating, 1);
        maxRating = Math.max(maxRating, rating);
    }

    public boolean matches(String word) {
        return (name.contains(word) || surname.contains(word));
    }
}
