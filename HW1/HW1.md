### Assignment #1

Design and implement a class called Grades that stores an array of int (grades). The class will contain the following methods/operations:

  1) highest - returns the highest grade
  2) lowest - returns the lowest grade
  3) number of grades - returns the number of grades in the array
  4) average - returns the average of all the grades
  5) number of failing grades – takes in a grade value and returns the number of grades below the input grade value.
  6) histogram – creates a histogram that allows you to visually inspect the frequency distribution of grades.
  ```
	90 – 100 | ****
	80 – 89  | **********
	70 – 79  | ********
	60 – 69  | ****
	< 60     | **
```
Write a main method to test out this object. In the main program, allow the user to enter the grades into the array.  Since you would need to know the size of the array beforehand, you would prompt the user to first enter the number of grades and then prompt the user to enter each grade.  Valid grade values are 0 – 100 inclusive.


	For Example:
    ```
		Enter the number of grades to input: 5
		Enter grade 1:  90
		Enter grade 2:  80
		Enter grade 3:  70
		Enter grade 4:  85
		Enter grade 5:  95
    ```
### Class definition:

```
class Grades {

  private int[] values;

  Grades () {…};
  Grades (int[] myArray) {…};
  public void setValues(int[] myArray) { // set values declaration };
  public int[] getValues() { // returns values array};
  public int highest() {// returns the highest value in array };
  public int lowest() {// returns the lowest value in array };
  public int numOfGrades() {// returns the number of grades in array };
  public double average() { // returns the average of array };
  public int numOfFailingGrades(int gradeValue) { // returns the number of values in the array that are less than input value, gradeValue };
  public void histogram() { // prints the histogram of grades };

}  
```