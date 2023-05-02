
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class Principal {

    public static void main(String args[]) {
        try {
            
            String nomeServico = "calculadora";
            Calculadora calculadora = new CalculadoraImpl();
            Calculadora stub = (Calculadora) UnicastRemoteObject.exportObject(calculadora, 0);
            Registry registro = LocateRegistry.getRegistry();             
            registro.bind(nomeServico, calculadora);
            System.out.println("Servidor no ar. Nome do objeto no servidor: \'" + nomeServico + "\'");
        } catch (RemoteException re) {
            System.out.println("Excecao: " + re.getMessage());
        } catch (AlreadyBoundException abe) {
            System.out.println("Excecao: " + abe.getMessage());
        }

    }
}