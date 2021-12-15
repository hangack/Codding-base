# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-


def my_fun():
    return 10

def doctstring_exist(func):
    """입력된 함수 내 docstring이 있는지 확인하는 함수

    Args:
        func (collable): A Function

    Returns:
        bool
    """

    return func.__doc__ is not None # True, False

def no_docstring():
    return 10

def yes_docstring():
    """value값을 반환하는 함수"""
    return 10

if __name__ == "__main__":
    x = my_fun
    print(x())
    print("-----")
    print(doctstring_exist(no_docstring))
    print(doctstring_exist(yes_docstring))