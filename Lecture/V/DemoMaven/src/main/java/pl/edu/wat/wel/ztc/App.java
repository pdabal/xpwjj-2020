package pl.edu.wat.wel.ztc;
import com.fazecast.jSerialComm.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        for (SerialPort sp : SerialPort.getCommPorts()) {
            System.out.println(sp.getSystemPortName());
        }
    }
}
