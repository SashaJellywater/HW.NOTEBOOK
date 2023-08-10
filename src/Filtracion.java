import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Filtracion {
    public static List books(Set<Notebook> note) {
        List filtredNotebooks = new ArrayList();
        for (Notebook np : note) {
            filtredNotebooks.add(np);
        }

        System.out.println("Введите желаемые характеристики товара, если параметр не имеет значения - поставьте 0.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. производитель(ASUS, Apple, Acer, Lenovo): ");
        String makerUser = scanner.nextLine();
        if (makerUser.equals("0") == false) {
            for (Notebook np : note) {
                if (np.getMaker().equals(makerUser) == false)
                    filtredNotebooks.remove(np);
            }
        }
        System.out.println("2. ОС(Windows 10, Windows 11, macOS, Linux): ");
        String osUser = scanner.nextLine();
        if (osUser.equals("0") == false) {
            for (Notebook np : note) {
                if (np.getOs().equals(osUser) == false)
                    filtredNotebooks.remove(np);
            }
        }
        System.out.println("3. Цвет(black,grey,red,white,silver): ");
        String colorUser = scanner.nextLine();
        if (colorUser.equals("0") == false) {
            for (Notebook np : note) {
                if (np.getColor().equals(colorUser) == false)
                    filtredNotebooks.remove(np);
            }
        }
        System.out.println("4. RAM(не менее 8): ");
        int ramUser = scanner.nextInt();
        if (ramUser != 0) {
            for (Notebook np : note) {
                if (np.getRam() < ramUser)
                    filtredNotebooks.remove(np);
            }
        }
        System.out.println("4. Максимальная стоимость(цены стартуют oт 800$): ");
        int priceUser = scanner.nextInt();
        if (priceUser != 0) {
            for (Notebook np : note) {
                if (np.getPrice() > priceUser)
                    filtredNotebooks.remove(np);
            }
        }
        return filtredNotebooks;
    }
}
