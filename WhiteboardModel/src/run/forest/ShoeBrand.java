package run.forest;

public enum ShoeBrand {
    NIKE("Nike"),
    BROOKS("Brooks"),
    ASICS("Asics"),
    HOKA("Hoka"),
    NEW_BALANCE("New Balance"),
    SAUCONY("Saucony"),
    ALTRA("Altra"),
    KARHU("KARHU"),
    MIZUNO("Mizuno"),
    ON("On"),
    DIADORA("Diadora"),
    ADIDAS("Adidas"),
    TOPO_ATHLETIC("Topo Athletic");

    String name;
    ShoeBrand(String name){
        this.name = name;
    }

    public static ShoeBrand getBrand(String brand){
        for(ShoeBrand brandName : ShoeBrand.values()){
            if(brandName.name.equalsIgnoreCase(brand)){
                return brandName;
            }
        } return null;
    }
}