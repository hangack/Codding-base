# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-


"""
1. 기존 코드에서 set_tip 메서드 추가
2. tip 금액 입력 후 출력
"""
class Employee:
    name = None
    def set_name(self, name):
        self.name = name

    def set_tip(self, tip):
        self.tip = tip

if __name__ == "__main__":
    emp = Employee()
    emp.set_name("TT")
    print(emp.name)
    emp.set_tip(103)
    print(emp.tip)