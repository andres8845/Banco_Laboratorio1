
package cuentabancaria;

public class Banco {
    CuentaBancaria cuentas[];
    double tasaIntereses = 0.05;
    public Banco(int numero_cuentas){
        cuentas = new CuentaBancaria[numero_cuentas];
    }
    
    public CuentaBancaria buscar(int code){
        for (CuentaBancaria cuenta : cuentas) {
            if(cuenta.getCodigo()==code){
                return cuenta;
            }
        }
        return null;
    }
    
    public boolean agregar(int code, String name){
        if(buscar(code)==null){
        for (int i =0;i<cuentas.length;i++) {
        if(cuentas[i]==null){
            cuentas[i]=new CuentaBancaria(code, name);
            return true;
        }
        }
        }
        return false;
    }
    public void tranferir(int code,int code_2,double monto){
       if(buscar(code)!=null&&buscar(code_2)!=null){
           for (CuentaBancaria cuenta : cuentas) {
               if(cuenta.getCodigo()==code){
                   cuenta.retirar(monto);
               }
           }
            for (CuentaBancaria cuenta : cuentas) {
               if(cuenta.getCodigo()==code_2){
                   cuenta.depositar(monto);
               }
           }
       }
    }
    
    public void intereses(){
        for (CuentaBancaria cuenta : cuentas) {
            double monto_depos=cuenta.getSaldo()*tasaIntereses;
            cuenta.depositar(monto_depos);
        }
    }
    
    public void lista(double monto){
        for (CuentaBancaria cuenta : cuentas) {
            if(cuenta.getSaldo()>=monto){
                cuenta.print();
            }
        }
    }
}
