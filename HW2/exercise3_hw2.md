## HW2 Exercise 3b

### What is the outcome of student1 + student2 + student3?
Since no parentheses were used in this example, the operations are performed sequentially. Therefore, the calculation
could also be written as follows:<br>
**(student1 + student2) + student3**

- First, student1 and student2 are added together. This calls the add()-method of the Student class, which returns a new object of type LearningGroup that contains student1 and student2.<br>
  **student1 + student2 -> LearningGroup(student1, student2)**
  
- Then, the generated object of type LearningGroup is added to student3. This calls the add()-method of the LearningGroup class, which returns a new object of type LearningGroup that contains all three students.<br>
  **LearningGroup(student1, student2) + student3 -> LearningGroup(student1, student2, student3)**
