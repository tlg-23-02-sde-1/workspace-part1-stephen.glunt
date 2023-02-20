package com.entertainment;


import java.util.Arrays;

/*
 * Business class to model the workings of a television set.
 * No main() method here.
 */
public class Television {
    // Class level (static) variables and constants
    private static int nextId = 1;
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    public static final String[] VALID_BRANDS = {"Samsung", "Sony", "LG", "Toshiba"};

    // Static methods
    public static int getInstanceCount() {
        return instanceCount;
    }

    // attributes or properties, called "fields" or "instance variables"
    private String brand;
    private int volume = 1;
    private DisplayType display = DisplayType.LCD;
    private final int id;
    private int lastVolume = 0;
    private boolean isMuted = false;

    /**
     * Default constructor
     */
    public Television() {
        this.id = nextId++;
        instanceCount++;
    }

    /**
     * Constructor
     *
     * @param brand
     */
    public Television(String brand) {
        this();
        setBrand(brand);
    }

    /**
     * Constructor
     *
     * @param brand
     * @param volume
     */
    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        this.display = display;
    }

    // functions or operations, called "methods" in Java

    /**
     * Turns Television on.
     */
    public void turnMeOn() {
        System.out.println("Your " + brand + " TV it very turned on. Volume is " + volume + ".");
    }

    /**
     * Returns muted status
     *
     * @return isMuted t/f
     */
    public boolean isMuted() {
        return isMuted;
    }

    /**
     * Flags Television as muted and saves volume.
     * Unflags Television as muted and sets volume to equal the last volume.
     */
    public void mute() {
        isMuted = !isMuted;
        if (isMuted) {
            lastVolume = getVolume();
            setVolume(0);
        } else {
            setVolume(lastVolume);
        }
    }

    /**
     * Displays message that indicates the TV is turned off.
     */
    public void turnMeOff() {
        System.out.println("Shutting the " + getBrand() + " TV down... goodbye.");
    }

    /**
     * Sets brand for Television instance
     *
     * @param brand
     */
    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        } else {
            System.out.println(brand + " is an invalid brand. Valid brands are " + Arrays.toString(VALID_BRANDS));
        }
    }

    private static boolean isValidBrand(String brand) {
        boolean valid = false;
        for (String validBrand : VALID_BRANDS) {
            if (validBrand.equals(brand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    /**
     * Sets volume for Television object
     *
     * @param vol
     */
    public void setVolume(int vol) {
        if (vol >= MIN_VOLUME && vol <= MAX_VOLUME) {
            if (isMuted) mute();
            volume = vol;
        } else if (vol < MIN_VOLUME) {
            volume = MIN_VOLUME;
            System.out.printf("You cannot set volume to %s. The volume is now %s/n", vol, volume);
        } else if (vol > MAX_VOLUME) {
            volume = MAX_VOLUME;
            System.out.printf("You cannot set volume to %s. The volume is now %s/n", vol, volume);
        }
    }

    public void setVolume(VolumeLevel volume) {
        setVolume(volume.getValue());
    }

    /**
     * Gets Television id.
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Gets Television volume.
     *
     * @return
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Gets Televisioin brand
     *
     * @return
     */
    public String getBrand() {
        return brand;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public String toString() {
        //result = boolean ? assignedIfTrue : assignedIfFalse
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television brand=%s, id=%s, display=%s, volume=%d",
                getBrand(), getId(), getDisplay(), getVolume());
    }

}
