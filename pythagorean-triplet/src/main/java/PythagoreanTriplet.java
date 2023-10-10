import java.util.ArrayList;
import java.util.List;

class PythagoreanTriplet {

    private int sideA;
    private int sideB;
    private int sideC;

    PythagoreanTriplet(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof PythagoreanTriplet) {
            PythagoreanTriplet other = (PythagoreanTriplet) o;
            return sideA == other.sideA && sideB == other.sideB && sideC == other.sideC;
        } else {
            return false;
        }
    }

    static class TripletListBuilder {
        private int targetSum;
        private Integer maxFactor = null;
        private static final double PERIMETER_RATIO_LIMIT = 1 + 1 + Math.sqrt(2);

        TripletListBuilder thatSumTo(int sum) {
            this.targetSum = sum;
            if (maxFactor == null) {
                maxFactor = targetSum;
            }
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int max) {
            this.maxFactor = max;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for (int a = 1; a <= Math.floor(targetSum / PERIMETER_RATIO_LIMIT); a++) {
                int numerator = a * a + (int) Math.pow(targetSum - a, 2);
                int denominator = 2 * (targetSum - a);
                if (numerator % denominator == 0) {
                    int c = numerator / denominator;
                    if (c <= maxFactor) {
                        int b = targetSum - a - c;
                        triplets.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }
            return triplets;
        }
    }
}

/*  @Test
    public void tripletsWhoseSumIs12() {
        List<PythagoreanTriplet> actual
                = PythagoreanTriplet
                        .makeTripletsList()
                        .thatSumTo(12)
                        .build();
        List<PythagoreanTriplet> expected
                = Collections.singletonList(new PythagoreanTriplet(3, 4, 5));
        assertThat(actual).isEqualTo(expected);
    }*/