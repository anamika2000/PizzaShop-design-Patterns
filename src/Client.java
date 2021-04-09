import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static String beverageType="";
    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        Cook cook = new Cook();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What do you want to order?");
            System.out.println("(1) Pizza");
            System.out.println("(2) Drink");
            System.out.println("(Other) I have finished ordering.");

            int a = scanner.nextInt();
            if(a==1) {
                ArrayList<String> VegList = new ArrayList<>();
                ArrayList<String> CheeseList = new ArrayList<>();
                ArrayList<String> NonvegList = new ArrayList<>();

                String pizzaType = null;
                String answer = null;

                while (true) {
                    System.out.println("Which pizza do you want?");
                    System.out.println("(1) Regular Pizza --- 50");
                    System.out.println("(2) Thincrust Pizza --- 70");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        answer = input.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (answer.equals("1")) {
                        pizzaType = "Regular Pizza";
                        System.out.println("*** Regular Pizza");
                        break;
                    } else if (answer.equals("2")) {
                        pizzaType = "Thincrust Pizza";
                        System.out.println("*** Thincrust Pizza");
                        break;
                    } else {
                        continue;
                    }
                }
                System.out.println("");

                System.out.println("-------------------- TOPINGS --------------------");
                Scanner scan = new Scanner(System.in);
                for (int i = 0; i < 2; i++) {
                    System.out.println("-------------------- Veg Topings--------------------");
                    System.out.println("(1) Olive---");
                    System.out.println("(2) Mushroom ---");
                    System.out.println("(Other) I finished the toping selection.");

                    int value = scan.nextInt();
                    if (value == 1) {
                        VegList.add("Olive");
                        System.out.println("*** Olive is selected");
                    } else if (value == 2) {
                        VegList.add("Mushroom");
                        System.out.println("*** Mushroom is selected");
                    } else break;
                }
                System.out.println("The selection of topings is completed.");
                System.out.println("");

                Scanner scan2 = new Scanner(System.in);
                for (int i = 0; i < 2; i++) {
                    System.out.println("-------------------- Cheese Types --------------------");
                    System.out.println("(1) DoubleCheese --- ");
                    System.out.println("(2) CheeseCorn --- ");
                    System.out.println("(Other) I finished the cheese topings.");
                    int value = scan2.nextInt();
                    if (value == 1) {
                        CheeseList.add("DoubleCheese");
                        System.out.println("*** Double Cheese is selected");
                    } else if (value == 2) {
                        CheeseList.add("CheeseCorn");
                        System.out.println("*** Cheesecorn is selected.");
                    } else break;
                }
                System.out.println("The selection of Cheese is completed.");
                System.out.println("");

                Scanner scan3 = new Scanner(System.in);
                for (int i = 0; i < 2; i++) {
                    System.out.println("-------------------- Nonveg Topings--------------------");
                    System.out.println("(1) Chickenchunks-- ");
                    System.out.println("(2) Pepperoni --- ");
                    System.out.println("(Other) I finished the Nonveg topings selection.");
                    int value = scan3.nextInt();
                    if (value == 1) {
                        NonvegList.add("Chickenchunks");
                        System.out.println("*** Chickenchunks is selected");
                    } else if (value == 2) {
                        NonvegList.add("Pepperoni");
                        System.out.println("*** Pepperoni is selected");
                    } else break;
                }
                System.out.println("The selection of Nonveg  is completed.");
                System.out.println("");

                String[] VegArr = new String[VegList.size()];
                VegArr = VegList.toArray(VegArr);

                String[] CheeseArr = new String[CheeseList.size()];
                CheeseArr = CheeseList.toArray(CheeseArr);

                String[] NonvegArr = new String[NonvegList.size()];
                NonvegArr = NonvegList.toArray(NonvegArr);

                PizzaOrder pizzaOrder = new PizzaOrder(cook, pizzaType, VegArr, CheeseArr, NonvegArr);
                waitress.takeOrder(pizzaOrder);
            }

            else if(a==2) {
                Scanner scanBeverage = new Scanner(System.in);
                System.out.println("-------------------- DRINKS --------------------");
                for (int i = 0; i < 1; i++) {
                    System.out.println("-------------------- Drink Types --------------------");
                    System.out.println("(1) Tea --- 20");
                    System.out.println("(2) Coffee --- 45");
                    System.out.println("(3) Coke--- 25");
                    System.out.println("(4) Ice Tea --- 30");
                    System.out.println("(Other) I finished the drink selection.");
                    int drink = scanBeverage.nextInt();
                    if(drink==1){
                        beverageType="Tea";
                        System.out.println("*** Tea is selected");
                    }
                    else if(drink==2){
                        beverageType="Coffee";
                        System.out.println("*** Coffee is selected");
                    }
                    else if(drink==3){
                        beverageType="Cola";
                        System.out.println("*** Cola is selected");
                    }
                    else if(drink==4){
                        beverageType="Ice Tea";
                        System.out.println("*** Ice Tea is selected");
                    
                    }
                    else{
                        break;
                    }
                }
                System.out.println("The selection of drinks is completed.");
                System.out.println("");

                BeverageOrder beverageOrder = new BeverageOrder(cook, beverageType);
                waitress.takeOrder(beverageOrder);
            }

            else{
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("ENJOY");
                break;
            }
        }
    }
}
