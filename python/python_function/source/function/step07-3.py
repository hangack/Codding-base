# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

# global > nonlocal > local
# NonLocal
x = 1000
def a():
    x = 10

    def b():
        nonlocal x  # x 객체 nonlocal로 초기화
        x = 100
        print(x)

    b()
    print(x)

if __name__ == "__main__":
    a()
    print(x)