public class Book {
    private static String author;
    private static String title;
    private static int pageNumber;
    private static double price;
    private static boolean available;
    public static String bookInfo(String bookTitle){
        title = bookTitle;
        return title;
    }
    public static String bookInfo(String bookTitle, String authorName){
        author = authorName;
        title = bookTitle;
        return (title + " " +  author);
    }
    public static int bookInfo(int x){
        pageNumber = x;
        return pageNumber;
    }
    public static double bookInfo(double x){
        price = x;
        return price;
    }
    public static boolean bookInfo(boolean y){
        available = y;
        return available;
    }

}
