public class Main {
    public static void main(String[] args) {
        System.out.println("Part 1");
        System.out.println(Add(x,y));
        System.out.println(Subtraction(x,y));
        System.out.println(Multiplication(x,y));
        System.out.println(Division(x,y));
        System.out.println("Part 2");
        print();
        System.out.println(Book.bookInfo("The Hunger Games", "Suzanne Collins"));
        System.out.println("$" + Book.bookInfo(9.88));
        System.out.println("Has " + Book.bookInfo(375) + " pages.");
        System.out.println("Is the book currently available?: " + Book.bookInfo(true));
    }
    public static double x = 10;
    public static double y = 5;
    public static double Add(double num1, double num2){
        return(num1+num2);
    }
    public static double Subtraction(double num1, double num2){
        return(num1-num2);
    }
    public static double Multiplication(double num1, double num2){
        return(num1 * num2);
    }
    public static double Division(double num1, double num2){
        return(num1/num2);
    }
    public static void print(){
        System.out.println("Rodney Olid");
    }

}