# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

class Employee:
    MIN_TIP = 3000

    def __init__(self,name,tip = MIN_TIP):
        self.name = name
        if tip >= Employee.MIN_TIP:
            self.tip = tip
        else:
            self.tip = Employee.MIN_TIP

    def give_riase(self, amount):
        self.tip += amount

class Manager(Employee):
    pass

if __name__ == "__main__":
    mng = Manager("Evan",50000)
    print(mng.name)
    print(mng.tip)

