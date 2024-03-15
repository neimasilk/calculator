import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator(); // Membuat objek Calculator

        System.out.println("Selamat datang di Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        double a = scanner.nextDouble();
        
        System.out.print("Masukkan angka kedua: ");
        double b = scanner.nextDouble();
        
        System.out.println("Pilih operasi (1=Penjumlahan, 2=Pengurangan, 3=Perkalian, 4=Pembagian): ");
        int choice = scanner.nextInt();
        
        try {
            switch(choice) {
                case 1:
                    System.out.println("Hasil: " + calc.addition(a, b));
                    break;
                case 2:
                    System.out.println("Hasil: " + calc.subtraction(a, b));
                    break;
                case 3:
                    System.out.println("Hasil: " + calc.multiplication(a, b));
                    break;
                case 4:
                    System.out.println("Hasil: " + calc.division(a, b));
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
