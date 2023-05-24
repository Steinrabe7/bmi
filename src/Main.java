// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weightKg = 50;
        double heightМ = 1.60;

        int index = service.calculate(weightKg, heightМ);

        System.out.println(index);


        }
    }