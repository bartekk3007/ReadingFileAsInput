import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine())
        {
            System.out.println("Imie to: " + scanner.nextLine());
        }
    }
}