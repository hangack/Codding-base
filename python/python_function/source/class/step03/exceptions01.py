# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- conding: utf-8 -*-

def error01():
    a = 10
    a / 0
    # ZeroDivisionError: division by zero

def error02():
    a = [1,2,3,4,5]
    a[10]
    # IndexError: list index out of range

def error03():
    a = 1000
    a + "안녕"
    # TypeError: unsupported operand type(s) for +: 'int' and 'str'

def error04():
    a = 1000
    a + b
    # NameError: name 'b' is not defined

if __name__ == "__main__":

    error02()

    print("Program is done")