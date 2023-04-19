package Problema5;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Supermarket {

    public static void main(String[] args) {
        String salesFileName = "C:\\caminho\\compras.txt";
        String customersFileName = "C:\\caminho\\clientes.txt";
        ArrayList<Double> sales = new ArrayList<>();
        ArrayList<String> customers = new ArrayList<>();

        sales = readSales(salesFileName);
        customers = readCustomers(customersFileName);
        String bestCustomerName = nameOfBestCustomer(sales, customers);
        System.out.println("O melhor cliente é: " + bestCustomerName);
    }

    public static ArrayList<Double> readSales(String salesFileName) {
        ArrayList<Double> sales = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(salesFileName));
            while (sc.hasNext()) {
                String line = sc.nextLine();
                try {
                    double sale = Double.parseDouble(line);
                    sales.add(sale);
                } catch (NumberFormatException e) {

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sales;
    }

    public static ArrayList<String> readCustomers(String customersFileName) {
        ArrayList<String> customers = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File(customersFileName));
            while (sc.hasNext()) {
                customers.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers) {
        int index = 0;
        double max = sales.get(0);
        for (int i = 1; i < sales.size(); i++) {
            if (sales.get(i) > max) {
                max = sales.get(i);
                index = i;
            }
        }
        return customers.get(index);
    }

}