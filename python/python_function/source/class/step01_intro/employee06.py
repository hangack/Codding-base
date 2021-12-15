# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-


"""
"""


class Employee:

    # instance state == attribute
    def __init__(self, name, tip):
        self.name = name
        #tip = abs(tip)
        if tip < 0:
            print("error: tip은 0 또는 양수여야 합니다.")
            return None
        self.tip = tip

    def give_raise(self, new_tip):
        self.tip += new_tip

    def weekly_tip(self):
        daily_tip = self.tip / 7
        return daily_tip


if __name__ == "__main__":
    emp = Employee("Evan", -50000)
    print(emp.name)
    print(emp.tip)

    emp.tip = emp.tip + 1500
    print(emp.tip)

    emp.give_raise(1500)
    print(emp.tip)

    weekly_tips = emp.weekly_tip()
    print(weekly_tips)