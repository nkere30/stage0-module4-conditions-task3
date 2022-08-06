package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public static void isFirstAliquot(int first, int second) {
        if(second % first == 0) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }

    public static void main(String[] args){
        isFirstAliquot(6, 3);
        isFirstAliquot(2, 2);
        isFirstAliquot(5, -1);
        isFirstAliquot(7, 3);
        isFirstAliquot(3, 8);
        isFirstAliquot(6, -2);
    }
}
