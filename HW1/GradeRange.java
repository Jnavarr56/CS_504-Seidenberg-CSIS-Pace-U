import java.util.*;

public class GradeRange {

    private int min;
    private int max = 0;
    private int scoresInRange = 0;

    public GradeRange(int min, int max) {

        this.min = min;
        this.max = max;

    }

    public GradeRange(int min) {

        this.min = min;

    }

    public void isInRange(int score) {

        if (this.max != 0) {

            this.scoresInRange  = score >= this.min && score <= this.max ? this.scoresInRange + 1 : this.scoresInRange;

        }

        else {

            this.scoresInRange  = score < this.min ? this.scoresInRange + 1 : this.scoresInRange;

        }

    }

    public String showFreqStr() {

        String rangeAsStr = this.max != 0  ? this.min + " - " + this.max : "< " + this.min;
        
        return String.format(
            "%s%s| %s", 
            rangeAsStr,
            " ".repeat(9 - rangeAsStr.length()),
            "*".repeat(this.scoresInRange)
        );

    }

}





