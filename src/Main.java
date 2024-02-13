import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                HashMap<String, Double> cityNameAndTemp = new HashMap<>();
                ArrayList<String> cityNames = new ArrayList<>();
                Scanner input = new Scanner(System.in);

                System.out.println("Enter a city name! Enter END to stop entering in city names");
                String city = input.nextLine();

                while (!(city.equals("END"))) {
                    cityNames.add(city);
                    System.out.println("Enter a city name! Enter END to stop entering in city names");
                    city = input.nextLine();
                }

                for (String cityName : cityNames) {
                    System.out.println("Enter 5 temperatures for the city: " + cityName);

                    double temperature1 = input.nextDouble();
                    double temperature2 = input.nextDouble();
                    double temperature3 = input.nextDouble();
                    double temperature4 = input.nextDouble();
                    double temperature5 = input.nextDouble();
                    double averageTemp = (temperature1+temperature2+temperature3+temperature4+temperature5)/5;
                    System.out.println("The average temperature for "+cityName + " is " + averageTemp);

                }
                System.out.println(cityNameAndTemp);

            }
        }
