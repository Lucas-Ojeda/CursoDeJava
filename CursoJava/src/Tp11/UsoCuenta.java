package Tp11;
import com.sun.org.apache.xpath.internal.SourceTree;

public class UsoCuenta {

    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente(40000, "Lucas");
        CuentaCorriente cuenta2 = new CuentaCorriente(22500, "Marcelo");

        System.out.println("-----------------------------------------------------------------------");
        System.out.println(cuenta1.getDatos());
        System.out.println("Saldo Cuenta 1: "+cuenta1.getSaldo());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(cuenta2.getDatos());
        System.out.println("Saldo Cuenta 2: "+cuenta2.getSaldo());
        System.out.println("-----------------------------------------------------------------------");

        cuenta1.transferencia(2500,cuenta1,cuenta2);

        System.out.println("TRANFERENCIA REALIZADA CON EXITO");
        System.out.println("Saldos actuales:");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(cuenta1.getDatos());
        System.out.println("Saldo Cuenta 1: "+cuenta1.getSaldo());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(cuenta2.getDatos());
        System.out.println("Saldo Cuenta 2: "+cuenta2.getSaldo());
        System.out.println("-----------------------------------------------------------------------");

    }

}