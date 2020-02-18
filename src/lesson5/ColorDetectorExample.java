package lesson5;

public class ColorDetectorExample {

    public String detect(int waveLength) {
        if (waveLength > 380 && waveLength <= 449) {
            return "Violet";
        } else if (waveLength > 450 && waveLength <= 560) {
            return "";
        } else {
            return "Inv";
        }
    }
}
