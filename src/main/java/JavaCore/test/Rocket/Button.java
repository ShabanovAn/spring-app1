package JavaCore.test.Rocket;

import java.util.ArrayList;
import java.util.List;

public class Button {
    private ClickListener[] listeners = new ClickListener[10];
    private int count = 0;
//
   // private List<ClickListener> listenerList = new ArrayList<>();

    //Добавляем подписчиков
    public void addListener(ClickListener listener) {
        listeners[count++] = listener;

        //listenerList.add(listener);
    }

    //теперь на кнопку кто то нажал и все об этом узнают
    public void click() {
        for (int i = 0; i < count; i++) {
            listeners[i].onClick();
        }
//        for (ClickListener listener : listeners) {
//            listener.onClick();
//        }
    }
}
