import java.util.Scanner;
public class doido {
    public static void main(String[] args) {
        float doC ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dien vao do C");
        doC = scanner.nextFloat();
        float doF = (9*doC)/5+32;
        System.out.println("Do F la:"+ doF);

    }
}
