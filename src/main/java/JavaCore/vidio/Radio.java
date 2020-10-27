package JavaCore.vidio;

public class Radio implements ElectricityConsumer{

    public void playMusic()  {
        System.out.println("Радио Заиграло");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
