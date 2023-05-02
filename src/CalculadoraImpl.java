
import java.rmi.RemoteException;


public class CalculadoraImpl implements Calculadora {

    @Override
    public int adicao(int a, int b) throws RemoteException{
        System.out.println("A = " + a + "+  B = " + b);
        return a + b;
    }

    @Override
    public int subtracao(int a, int b) throws RemoteException {
        System.out.println("A = " + a + " - B = " + b);
        return a - b;
    }

    @Override
    public int produto(int a, int b) throws RemoteException{
        System.out.println("A = " + a + " * B = " + b);
        return a * b;
    }

    @Override
    public double divisao(int a, int b) throws RemoteException{
        System.out.println("A = " + a + " / B = " + b);
        return a / b;
    }
}