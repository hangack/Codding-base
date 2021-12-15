# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

# Class Attribute

class Employee:

    # Class Attribute
    MAX_TIP = 10000
    DEFAULT_TIP = 2000

    def __init__(self, name, tip = DEFAULT_TIP):
        self.name = name
        if tip >= Employee.MAX_TIP:
            self.tip = Employee.MAX_TIP
        else:
            self.tip = tip


if __name__ == "__main__":
    emp1 = Employee("Kim")
    print(emp1.tip)
    emp2 = Employee("Lee", 40000)
    print(emp2.tip)