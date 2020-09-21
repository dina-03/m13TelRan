public enum YearSeason {
    SPRING(15),
    SUMMER(29),
    WINTER(9),
    AUTUMN(10);

    private int middleTemperature;

    YearSeason(int middleTemperature){
        this.middleTemperature = middleTemperature;
    }


    public void clothingChoice(){
        switch (this){
            case SPRING:
                System.out.println("S");
                break;
            case SUMMER:
                System.out.println("Su");
                break;
            case WINTER:
                System.out.println("W");
                break;
            case AUTUMN:
                System.out.println("A");
                break;
        }
    }

    public static void main(String[] args) {
        YearSeason summer = YearSeason.SUMMER;
        summer.clothingChoice();
        System.out.println(AUTUMN.middleTemperature);
        System.out.println(summer.middleTemperature);
        int sum = 0;
        for (YearSeason s : YearSeason.values()) {
            sum += s.middleTemperature;
        }
        System.out.println(sum/YearSeason.values().length);
    }
}
