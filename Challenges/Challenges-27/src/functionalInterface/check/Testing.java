package functionalInterface.check;

import functionalInterface.Candidate;

public class Testing {
    public static void main(String[] args) {
        Candidate candidate = num -> {
            boolean yes=false;
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    yes = false;
                } else {
                    yes = true;
                }
            }
            return yes;
        };

        System.out.println ( candidate.isCandidate ( 5 ) );
    }
}
