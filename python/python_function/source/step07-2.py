# /e/Fear/Univ/Big_data/Training/Github/Codding-base-Python/pycharm/python_function/venv/Scripts/python
# -*- coding: utf-8 -*-

# global > nonlocal > local
# global
x = 100
def a():
    global x # x 객체 global로 초기화
    x = 40
    return x

if __name__ == "__main__":
    print(a())
    print(x)
