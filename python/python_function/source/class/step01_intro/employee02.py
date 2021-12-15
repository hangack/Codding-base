# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-


"""
1. 기존 코드에서 set_name 메소드 추가
2. 이름 설정
3. __init__ (X)
4. 이름 출력
"""
class Employee:
    name = None
    def set_name(self, name):
        self.name = name

if __name__ == "__main__":
    emp = Employee()
    emp.set_name("TT")
    print(emp.name)