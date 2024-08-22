public class KitchenRoomLight implements Light{
    private int brightness = 0;
    @Override
    public void on() {
        brightness = 100;
        System.out.println("Kitchen Room Light is ON at Full Brightness.");
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Kitchen Room Light is OFF.");
    }

    @Override
    public void dim(int level) {
        if (level >=0 && level <= 100){
            brightness = level;
        System.out.println("Kitchen Room Light dimmed to"+level+"%.");
        }
        else {
            System.out.println("Invalid brightness level.");
        }
    }
    public int getBrightness() {
        return brightness;
    }
}
