import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Podaj stałe koszty działalności:");
            double fixedCosts = scanner.nextDouble();

            System.out.println("Podaj koszt produkcji 1 sztuki:");
            double productionCost = scanner.nextDouble();

            System.out.println("Podaj ilość sztuk do sprzedania:");
            int quantity = scanner.nextInt();

            System.out.println("Podaj marżę w %:");
            double marginPercentage = scanner.nextDouble();

            double margin = productionCost + (productionCost * (marginPercentage / 100));
            double totalProfit = ((margin - productionCost) * quantity) - fixedCosts;


            System.out.printf("Cena jednego pączka wynosi: %.2f zł\n", margin);
            System.out.printf("Całkowity zysk ze sprzedaży wynosi: %.2f zł\n", totalProfit);


            System.out.println("Czy chcesz obliczyć jeszcze raz? (T/N)");
        } while (scanner.next().equalsIgnoreCase("T"));

    }
}