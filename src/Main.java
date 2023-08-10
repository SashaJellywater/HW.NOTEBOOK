import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Notebook n1 = new Notebook(1, "ASUS", "Windows 10", "black", 32, 2200);
        Notebook n2 = new Notebook(2, "ASUS", "Windows 11", "black", 32, 2100);
        Notebook n3 = new Notebook(3, "Apple", "macOS", "white", 24, 1200);
        Notebook n4 = new Notebook(4, "Apple", "macOS", "silver", 96, 2600);
        Notebook n5 = new Notebook(5, "Acer", "Linux", "grey", 16, 1000);
        Notebook n6 = new Notebook(6, "Lenovo", "Windows 11", "red", 8, 800);
        Notebook n7 = new Notebook(7, "Lenovo", "Windows 10", "white", 32, 1200);
        Notebook n8 = new Notebook(8, "ASUS", "Windows 10", "black", 24, 1900);
        Set<Notebook> noteBooks = new HashSet<>();
        noteBooks.add(n1);
        noteBooks.add(n2);
        noteBooks.add(n3);
        noteBooks.add(n4);
        noteBooks.add(n5);
        noteBooks.add(n6);
        noteBooks.add(n7);
        noteBooks.add(n8);

        Filtracion cataloge = new Filtracion();
        List filtredNotebooks = cataloge.books(noteBooks);
        if (filtredNotebooks.size()==0) {
            System.out.println("Очень жаль!Не нашлось ноутбука с указанными параметрами!");
        }
        else {
            System.out.println(filtredNotebooks.toString());
        }
    }
}
