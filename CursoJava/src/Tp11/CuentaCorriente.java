package Tp11;
public class CuentaCorriente {

    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(double saldo, String nombreTitular) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
    }
    public double getSaldo() {
        return this.saldo;
    }

    public String getDatos() {
        double aleat= Math.random()*1000000000;
        long l = (new Double(aleat).longValue());
        String datos = "Nombre de Titular: "+nombreTitular+"\nNumero de cuenta: "+l;
        return datos;
    }

    public void setIngreso(int monto,CuentaCorriente cuenta){
        this.saldo = cuenta.getSaldo()+ monto;
    }
    public void setRetiro(int monto,CuentaCorriente cuenta){
        this.saldo = cuenta.getSaldo()- monto;
    }


    public void transferencia(int monto, CuentaCorriente c1, CuentaCorriente c2){
        c1.setIngreso(monto, c1);
        c2.setRetiro(monto, c2);
    }

}