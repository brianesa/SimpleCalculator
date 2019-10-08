public class KalkulatorBaru extends Operasi {
    public static void main(String[] args) throws ErrorException {
        KalkulatorBaru kalkulasi = new KalkulatorBaru();
        UserInput user = new UserInput();
        Display output = new Display();

        try {
            // user menginputkan nomor menu yang dipilih
            user.inputPilihan();
        } catch (ErrorException e) {
            // menangkap error
            output.showErr(e.getMessage());
        }

        try {
            // jika angkaMenu = 1, kalkulator biasa
            if (user.angkaMenu == 1) {
                user.inputAngka1();
                user.inputAngka2();
                user.inputOperand();
                double hasil = kalkulasi.perhitungan(user.angka1, user.angka2, user.operand);
                output.show(hasil);
            }
            // jika angkaMenu = 2, kalkulator lingkaran
            else if (user.angkaMenu == 2) {
                user.inputNilaiR();
                double hasilLingkaran = kalkulasi.luasLingkaran(user.nilaiR);
                output.show(hasilLingkaran);
            }
        } catch (ErrorException e) {
            // menangkap error operand
            output.showErr(e.getMessage());
        } catch (Exception e) {
            // menangkap error lain bawaan java
            output.show(e.getMessage());
        }

    }
}
