package run.forest;

public enum ShoeSize {
    US_5(5.0),
    US_5_5(5.5),
    US_6(6.0),
    US_6_5(6.5),
    US_7(7.0),
    US_7_5(7.5),
    US_8(8.0),
    US_8_5(8.5),
    US_9(9.0),
    US_9_5(9.5),
    US_10(10.0),
    US_10_5(10.5),
    US_11(11.0),
    US_11_5(11.5),
    US_12(12.0),
    US_12_5(12.5),
    US_13(13.0),
    US_13_5(13.5),
    US_14(14.0),
    US_14_5(14.5),
    US_15(15.0);

    private final double size;

    ShoeSize(double size) {
        this.size = size;
    }

    public static ShoeSize findClosestSize(double size){
        ShoeSize closestSize = null;
        double minDiff = Double.MAX_VALUE;
        for(ShoeSize shoeSize : ShoeSize.values()) {
            double diff = Math.abs(size - shoeSize.getSize());
            if(diff < minDiff) {
                closestSize = shoeSize;
                minDiff = diff;
            }
        }
        return closestSize;
    }

    public double getSize() {
        return size;
    }


}
