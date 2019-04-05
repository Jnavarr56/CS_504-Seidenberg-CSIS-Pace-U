public class UnderGraduateStudent extends Student {

    public UnderGraduateStudent() {

        super();

        super.setLevel("UNDERGRADUATE");

    }

    public UnderGraduateStudent(int midtermExam, int finalExam) {

        super(midtermExam, finalExam);

        super.setLevel("UNDERGRADUATE");

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

        else if (avg >= 60.0 && avg <= 69.0) {

            return 'C';
            
        }

        else {

            return 'F';
            
        }
        

    }
    

}