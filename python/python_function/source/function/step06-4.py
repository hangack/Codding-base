# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

def a():
    x = [3, 6, 9]

    def b(y):
        print(y)

    for value in x:
        print("value: ", value)
        b(x)


if __name__ == "__main__":
    print(a())