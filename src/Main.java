import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Valyuta daxil edin");
        String valyuta = scanner.nextLine();
        System.out.println("Hedef valyuta daxil edin");
        String hedefvalyuta = scanner.nextLine();
        System.out.println("Deyer daxil edin");
        int deyer = scanner.nextInt();

        switch (valyuta) {
            case ("usd"):
                switch (hedefvalyuta) {

                    case "usd" -> System.out.println("netice" + deyer * 1);
                    case "azn" -> System.out.println("netice" + deyer * 1.7);
                    case "euro" -> System.out.println("netice" + deyer * 92);

                }
                        case  "azn":
                            switch (hedefvalyuta) {


                                case "usd" -> System.out.println("netice" + deyer * 0.59);
                                case "azn" -> System.out.println("netice" + deyer * 1);
                                case "euro" -> System.out.println("netice" + deyer * 0.54);
                            }

                        case "euro":

                            switch (hedefvalyuta) {

                                case "usd" -> System.out.println("netice" + deyer * 1.59);
                                case "azn" -> System.out.println("netice" + deyer * 2);
                                case "euro" -> System.out.println("netice" + deyer * 1);
                            }
                            }
                }
        }




































