### Assignment #2:
Create two child classes, UnderGraduateStudent and GraduateStudent that will extend from the Student class.  Override the char getLetterGrade() method in each of the child classes.  
Use Student.java class defined below: (complete and compile)

```
class Student {
   private int id;
   private int midtermExam;
   private int finalExam;

   public double calcAvg() {
      double avg;
      avg = (midtermExam + finalExam) / 2.0;
      return avg;
   }

   public char getLetterGrade() {
      char letterGrade = ‘ ‘;

      return letterGrade;
   }
}
```

For the GraduateStudent class, the lowest passing grade in the getLetterGrade() is a ‘C’.
90-100 =A
80-89 = B
70-79 =C
<70 = F

For the UnderGraduateStudent, the lowest passing grade in the getLetterGrade() is a ‘D’.
90-100 =A
80-89 = B
70-79 =C
60-69 = D
<60 =F

```
class UnderGraduateStudent extends Student {
}
class GraduateStudent extends Student {
}
```

Create a main() method in a separate class to test child classes created.
Design and implement an application that reads an arbitrary number of integers that are in the range of 0 to 50 inclusive and counts how many occurrences of each are entered.  After all inputs have been processed, print only the values that have an occurrence of greater than zero.  Also, print the number of occurrences next to the value. [HINT: use arrays and indexing ]

```
	e.g.

	Enter a value between 0 and 50 [ -1 to end ]: 10
	Enter a value between 0 and 50 [ -1 to end ]: 2
	Enter a value between 0 and 50 [ -1 to end ]: 30
	Enter a value between 0 and 50 [ -1 to end ]: 10
	Enter a value between 0 and 50 [ -1 to end ]: 3
	Enter a value between 0 and 50 [ -1 to end ]: 10
	Enter a value between 0 and 50 [ -1 to end ]: 30
	Enter a value between 0 and 50 [ -1 to end ]: 2
	Enter a value between 0 and 50 [ -1 to end ]: -1

	Output:

	The value of 2 has 2 occurrences.
	The value of 3 has 1 occurrences.
	The value of 10 has 3 occurrences.
	The value of 30 has 2 occurrences.
```