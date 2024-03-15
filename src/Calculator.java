public class Calculator {
    // Konstruktor kelas Calculator
    public Calculator() {
        // Inisialisasi jika diperlukan
    }

    // Metode untuk penjumlahan
    public double addition(double a, double b) {
        return a + b;
    }

    // Metode untuk pengurangan
    public double subtraction(double a, double b) {
        return a - b;
    }

    // Metode untuk perkalian
    public double multiplication(double a, double b) {
        return a * b;
    }

    // Metode untuk pembagian
    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol.");
        }
        return a / b;
    }
}

