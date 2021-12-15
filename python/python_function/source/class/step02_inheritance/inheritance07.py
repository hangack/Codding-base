# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

class Employee:
    def __init__(self,name,tip = 30000):
        self.name = name
        self.tip = tip

    def give_riase(self, amount):
        self.tip += amount
        return self.tip

class Manager(Employee):
    def disaply(self):
        print("Manager:",self.name)

    def __init__(self,name,tip=50000,project=None):
        Employee.__init__(self,name,tip)
        self.project = project

    # give_raise
    def give_riase(self, amount=0,bonus=2):
        if amount>0:
            Employee.give_riase(self,amount*bonus)
        else:
            Employee.give_riase(self, amount)

if __name__ == "__main__":
    mng = Manager("Evan",50000)
    print(mng.name)
    print(mng.tip)
    mng.give_riase(2000)
    print(mng.tip)