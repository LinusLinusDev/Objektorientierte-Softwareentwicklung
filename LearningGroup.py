class LearningGroup:
    def __init__(self):
        self.studentList = []

    def __str__(self):
        return str([str(student) for student in self.studentList])

    def __add__(self, other):
        if isinstance(other, Student):
            new_group = LearningGroup()
            new_group.studentList = self.studentList + [other]
            return new_group
        if isinstance(other, LearningGroup):
            new_group = LearningGroup()
            new_group.studentList = self.studentList + other.studentList
            return new_group
        return NotImplemented


class Student:
    def __init__(self, name, matNr):
        self.name = name
        self.matNr = matNr

    def __str__(self):
        return self.name + ' ' + str(self.matNr)

    def __add__(self, other):
        if isinstance(other, Student):
            new_group = LearningGroup()
            new_group.studentList = [self, other]
            return new_group
        elif isinstance(other, LearningGroup):  # Implemented in case: student + group
            return other + self
        return NotImplemented


if __name__ == '__main__':
    student1 = Student('Alice Wonderland', 42424242)
    student2 = Student('Bob Miller', 1564153)
    student3 = Student('Charly Robert', 4681398)

    group = student1 + student2
    group = group + student3
    group2 = student1 + student2 + student3

    print(group)
    print(group2)

'''
What is the outcome of student1 + student2 + student3?

Since no parentheses were used in this example, the operations are performed sequentially. Therefore, the calculation
could also be written as follows:
(student1 + student2) + student3

- First, student1 and student2 are added together. This calls the __add()__-method of the Student class, which returns a
  new object of type LearningGroup that contains student1 and student2.
  student1 + student2 -> LearningGroup(student1, student2)
  
- Then, the generated object of type LearningGroup is added to student3. This calls the __add()__-method of the 
  LearningGroup class, which returns a new object of type LearningGroup that contains all three students.
  LearningGroup(student1, student2) + student3 -> LearningGroup(student1, student2, student3)
'''
