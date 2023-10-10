class PrimeCalculator {

    int nth(int nth) {
        int count = 0;

        int num = 2;
        int prim = 2;
        if (nth < 1) {
            throw new IllegalArgumentException();
        }
        while (count != nth) {
            if (num == 2 || num == 3) {
                count++;
                prim = num;
            } else {
                int checkCount = 0;
                for (int i = 2; i <num; i++) {
                    if (num % i == 0) {
                        checkCount++;
                        break;
                    }
                }
                if (checkCount == 0) {
                    prim = num;
                    count++;
                }
            }
            num++;
        }
        return prim;
    }
}
