# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

# Class method: 필수적으로 공통 사용되는 메서드
# Class method / Static method 차이점은?

class Employee:
    # Class Attribute
    MAX_TIP = 10000
    DEFAULT_TIP = 2000

    def __init__(self, name, tip=DEFAULT_TIP):
        self.name = name
        if tip >= Employee.MAX_TIP:
            self.tip = Employee.MAX_TIP
        else:
            self.tip = tip

    @classmethod
    def from_file(cls, filename):
        with open(filename,"r") as f:
            name = f.read()
        return cls(name)



if __name__ == "__main__":

    emp = Employee("name")
    emp = Employee.from_file("../../../data/inheitance/employee_data.txt")
    print(emp.name)