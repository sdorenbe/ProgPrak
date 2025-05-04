package SmartSwitch;

public class Lamp implements Switchable, Dimmable {

    boolean on;
    int brightness;

    @Override
    public void setBrightness(int level) {
        if (on) {
            if (level > MAX_BRIGHTNESS)
                System.out.println("The maximum brightness is " + MAX_BRIGHTNESS);
            else if (level < 0)
                System.out.println("The minimum brightness is " + 0);
            else
                this.brightness = level;
        } else
            System.out.println("Turn lamp on first!");
    }

    @Override
    public int getBrightness() {
        return brightness;
    }

    @Override
    public void turnOn() {
        on = true;
        brightness = 1;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void dimToHalf() {
        Dimmable.super.dimToHalf();
    }
}
