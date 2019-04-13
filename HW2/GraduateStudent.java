public class GraduateStudent extends Student {

    public GraduateStudent() {

        super();

        //super.setLevel("GRADUATE");

        setLevel("GRADUATE");

    }

    public GraduateStudent(int midtermExam, int finalExam) {

        super(midtermExam, finalExam);

        //super.setLevel("GRADUATE");

        setLevel("GRADUATE");

    }

    public char getLetterGrade() {

        double avg = super.calcAvg();

        if (avg >= 90.0 && avg <= 100.0) {

            return 'A';

        }

        else if (avg >= 80.0 && avg <= 89.0) {

            return 'B';
            
        }

        else if (avg >= 70.0 && avg <= 79.0) {

            return 'C';
            
        }

        else {

            return 'F';
            
        }

    }

}