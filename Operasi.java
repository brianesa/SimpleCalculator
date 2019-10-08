public class Operasi 
{
    double hasil = 0;

    public double perhitungan(double angka1, double angka2, String operand) throws ErrorException
    {
        if(operand.equals("+") )
        {
            hasil = angka1 + angka2;
            return hasil;
        }
        else if(operand.equals("-"))
        {
            hasil = angka1 - angka2;
            return hasil;
        }
        else if(operand.equals("*"))
        {
            hasil = angka1 * angka2;
            return hasil;
        }
        else if(operand.equals("/"))
        {
            hasil = angka1 / angka2;
            return hasil;
        }
        else if(operand.equals("%"))
        {
            hasil = angka1 % angka2;
            return hasil;
        }
        else
        {
            // melempar error jika operand tidak valid
            throw new ErrorException("Error operand salah");
        }
        
    }

    public double luasLingkaran(double r){
        
        double phi = 3.14;
        return phi * r * r;

    }


}