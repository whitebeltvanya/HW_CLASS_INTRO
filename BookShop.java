public class BookShop {
    public static void main(String[] args) {

        Book simpleBook  = new Book("Eat, Pray, Learn Java", 2017,
                               "Bang of Four","", 9,12345);

        System.out.println("Информация о книге:");
        System.out.println(simpleBook.toString());
        System.out.println("Многостраничная: " + (simpleBook.isBig()? "да": "нет"));
        String searchWord  = "Java";
        System.out.println("Слово для поиска: "+searchWord);
        System.out.println(String.format("Слово \"%s\" найдено ? : ",searchWord) + (simpleBook.matches(searchWord)? "да": "нет"));

    }



}
