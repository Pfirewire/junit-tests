import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student() {
        id = 0;
        name = "";
        grades = new ArrayList<>();
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        grades = new ArrayList<>();
    }
    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        Integer gradeTotal = 0;
        for (Integer grade : grades) {
            gradeTotal += grade;
        }
        return gradeTotal.doubleValue() / grades.size();
    }

    public void updateGrade(int oldGrade, int newGrade) {
        for(int i = 0; i < grades.size(); i++) {
            if(grades.get(i) == oldGrade) {
                grades.set(i, newGrade);
            }
        }
    }

    public void deleteGrade(int grade) {
        for(int i = 0; i < grades.size(); i++) {
            if(grades.get(i) == grade) {
                grades.remove(i);
            }
        }
    }
}