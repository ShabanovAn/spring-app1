package JavaCore.HomeWork;

import java.util.Arrays;

public class Bar {
    public static void main(String[] args) {

        BomBox bomBox;

        Track1 track1 = BomBox::play;
        System.out.println(track1.sound1("Play sond 1"));

        Track2 track2 = BomBox::play;
        System.out.println(track2.sound2("Play sound 2"));

        Track3 track3 = BomBox::play;
        System.out.println(track3.sound3("Play sound 3"));

        Track4 track4 = BomBox::play;
        System.out.println(track4.sound4("Play sound 4"));

        Track5 track5 = BomBox::play;
        System.out.println(track5.sound5("Play sound 5"));

        Track6 track6 = s -> BomBox.play(s);
        System.out.println(track6.sound6("Play sound 6"));

        Track7 track7 = s -> BomBox.play(s);
        System.out.println(track7.sound7("Play sound 7"));

        Track8 track8 = s -> BomBox.play(s);
        System.out.println(track8.sound8("Play sound 8"));

        Track9 track9 = s -> BomBox.play(s);
        System.out.println(track9.sound9("Play sound 9"));

        Track10 track10 = s -> BomBox.play(s);
        System.out.println(track10.sound10("Play sound 10"));

        Track11 track11 = new Track11() {
            @Override
            public String sound11(String sound11) {
                return BomBox.play(sound11);
            }
        };
        System.out.println(track11.sound11("Play sound 11"));
    }
}
