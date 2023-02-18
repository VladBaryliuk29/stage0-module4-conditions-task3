package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(double first, double second) {
        if(first / second >= 0 &&  first / second < 1 && second % first == 0 && second != 1) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }

}
