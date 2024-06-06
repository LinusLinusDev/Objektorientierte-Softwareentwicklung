package HW3;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ThesisGradingTest {
    ThesisGrading grading;

    @BeforeEach
    public void beforeEach() {
        grading = new ThesisGrading();
    }

    @AfterEach
    public void afterEach() {
        grading = null;
    }

    public void doTest(double grade1, double grade2, double grade3, String exception) {
        System.out.print(STR."TC: grade1: \{grade1}, grade2: \{grade2}, grade3: \{grade3}, ");
        try {
            System.out.print(STR."return: \{grading.calculcateFinalGrade(grade1,grade2,grade3)}, ");
        } catch (NoSuchGradeException e) {
            System.out.print(STR."return: NoSuchGradeException(\{e.getMessage()}), ");
        } catch (ThirdExaminerNeededException e) {
            System.out.print("return: ThirdExaminerNeededException, ");
        }

        System.out.println(STR."exception: \{exception}");
    }

    @Test
    @DisplayName("T1: 1.0 2.0 3.0")
    void test1() {
        doTest(1.0, 2.0, 3.0, "1.5");
    }

    @Test
    @DisplayName("T2: 1.0 5.0 3.0")
    void test2() {
        doTest(1.0, 5.0, 3.0, "2.0");
    }

    @Test
    @DisplayName("T3: 1.0 5.0 0.0")
    void test3() {
        doTest(1.0, 5.0, 0.0, "ThirdExaminerNeededException");
    }

    @Test
    @DisplayName("T4: 1.0 5.1 3.0")
    void test4() {
        doTest(1.0, 5.1, 3.0, "NoSuchGradeException(5.1)");
    }

    @Test
    @DisplayName("T5: 4.0 5.0 5.0")
    void test5() {
        doTest(4.0, 5.0, 5.0, "4.5");
    }
}