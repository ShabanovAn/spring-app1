package JavaCore.vidio;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.ArrayList;
import java.util.List;

public class Swither {


    private List <ElectricityConsumer> listeners = new ArrayList<>();


    public void addElectricityListener(ElectricityConsumer listener){
        listeners.add(listener);

    }
    public void removeElectricityListener(ElectricityConsumer listener){
        listeners.remove(listener);

    }

    public void switchON() {
        System.out.println("Выключатель включен");
        for (ElectricityConsumer c : listeners) {
            c.electricityOn(this);
            
        }
    }
}
