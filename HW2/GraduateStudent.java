public class GraduateStudent extends Student {

    public GraduateStudent() {

        super();

        super.setLevel("GRADUATE");

    }

    public GraduateStudent(int midtermExam, int finalExam) {

        super(midtermExam, finalExam);

        super.setLevel("GRADUATE");

    }
    /*

    public char getLetterGrade() {

        //System.out.println();

    }
    */

}