public class DataType {
    public static void main(String[] args) {
        int score = 100;
        float gpa = 4.13f;
        System.out.println(score);
        //score = 99.9;
        score = (int)99.9;
        System.out.println(score);
        System.out.println(gpa);
        score = (int)gpa;
        System.out.println(score);
        System.out.println(gpa);
        gpa = score;
        System.out.println(gpa);

    }
}
