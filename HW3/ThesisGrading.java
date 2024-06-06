package HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThesisGrading {
    private static final List<Double> validSingleGrades = List.of(1.0, 1.3, 1.7, 2.0, 2.3, 2.7, 3.0, 3.3, 3.7, 4.0, 5.0);

    public double calculcateFinalGrade(double grade1, double grade2, double grade3) throws NoSuchGradeException, ThirdExaminerNeededException {
        if(!validSingleGrades.contains(grade1)) {
            throw new NoSuchGradeException(grade1);
        }
        if(!validSingleGrades.contains(grade2)) {
            throw new NoSuchGradeException(grade2);
        }

        if(Math.abs(grade1 - grade2) >= 2.0) {
            if(grade3 == 0.0) {
                throw new ThirdExaminerNeededException();
            }
            if(!validSingleGrades.contains(grade3)) {
                throw new NoSuchGradeException(grade3);
            }

            List<Double> grades = new ArrayList<>(List.of(grade1, grade2, grade3));
            Collections.sort(grades);

            return (grades.get(0) + grades.get(1)) / 2.0;
        }

        return (grade1 + grade2) / 2.0;
    }
}
