package Task1;

public class LivingRoomLight implements Light{
    private int brightness;
    @Override
    public void on() {
        brightness = 100;
        System.out.println("Living Room Task1.Light is ON at Full Brightness.");
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Living Room Task1.Light is OFF.");
    }

    @Override
    public void dim(int level) {
        if (level >= 0 && level <= 100) {
            brightness = level;
            System.out.println("Living Room Task1.Light dimmed to" + level + "%.");
        }
        else {
            System.out.println("Invalid brightness level.");
        }
    }
}
