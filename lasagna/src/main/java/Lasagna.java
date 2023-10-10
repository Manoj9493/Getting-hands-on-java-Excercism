public class Lasagna {
    private static final int  EXPECTED_MINUTES_IN_OVEN_ACCORDING_THE_COOKINGBOOK = 40;
    private static final int TIME_FOR_PREPARING_EACH_LAYER = 2;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_IN_OVEN_ACCORDING_THE_COOKINGBOOK;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesLasagnaInOven){
                return expectedMinutesInOven()-actualMinutesLasagnaInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers * TIME_FOR_PREPARING_EACH_LAYER;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers,int minutesTheLasagnaHasBeenInTheOven){
                return preparationTimeInMinutes(layers)+minutesTheLasagnaHasBeenInTheOven;
    }
}
