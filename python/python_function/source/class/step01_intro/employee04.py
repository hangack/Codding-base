# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-


"""
1. method give_raise(new_tip)
    tip = 9000
    new_tip = +3000

2. weekly_tip():
    tip / 7
"""
class Employee:
    name = None
    def set_name(self, name):
        self.name = name

    def set_tip(self, tip):
        self.tip = tip

    def give_raise(self, new_tip):
        self.tip += new_tip

    def weekly_tip(self):
        daily_tip = self.tip/7
        return daily_tip

if __name__ == "__main__":
    emp = Employee()
    emp.set_name("TT")
    print(emp.name)
    emp.set_tip(50000)
    print(emp.tip)

    emp.tip = emp.tip + 1500
    print(emp.tip)

    emp.give_raise(1500)
    print(emp.tip)

    weekly_tips = emp.weekly_tip()
    print(weekly_tips)