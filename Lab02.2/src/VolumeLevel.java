enum VolumeLevel {
    OFF(0),
    SOFT(25),
    MEDIUM(50),
    LOUD(75),
    MAX(100);

    private final int value;

    VolumeLevel(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}