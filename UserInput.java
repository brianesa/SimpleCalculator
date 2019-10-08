import java.util.Scanner;

public class UserInput {
    double angka1;
    double angka2;
    double angkaMenu;
    double nilaiR;
    String operand;
    Scanner input = new Scanner(System.in);

    public void inputPilihan() throws ErrorException
    {
        System.out.println("pilih kalkulator (1. kalkulator biasa, 2. kalkulator lingkaran): ");

        // cek input angka atau bukan
        if (input.hasNextDouble()) {
            angkaMenu = input.nextDouble();
            // cek apakah angka bukan antara 1 atau 2
            if (angkaMenu < 1 || angkaMenu > 2) {
                // melempar error jika angka bukan antara 1 atau 2 
                throw new ErrorException("angka harus 1 atau 2!");
            }
        } else {
            // melempar error jika input bukan angka
            throw new ErrorException("input harus angka!");
        }

    }

    public void inputAngka1() throws ErrorException {

        System.out.println("input angka pertama:");

        // cek input angka atau bukan
        if (input.hasNextDouble()) {
            angka1 = input.nextDouble();
        } else {
            // melempar error jika input bukan angka
            throw new ErrorException("input harus angka!");
        }

    }

    public void inputAngka2() throws ErrorException {
        System.out.println("input angka kedua:");

        // cek input angka atau bukan
        if (input.hasNextDouble()) {
            angka2 = input.nextDouble();
        } else {
            // melempar error jika input bukan angka
            throw new ErrorException("input harus angka!");
        }
    }

    public String inputOperand() {

        System.out.println("input operand:");

        operand = input.next();

        return operand;
    }

    public void inputNilaiR() throws ErrorException {

        System.out.println("input nilai r:");

        // cek input angka atau bukan
        if (input.hasNextDouble()) {
            nilaiR = input.nextDouble();
        } else {
            // melempar error jika input bukan angka
            throw new ErrorException("input harus angka!");
        }

    }

}