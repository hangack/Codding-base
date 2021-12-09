# /e/Fear/Univ/Big_data/Training/Github/Codding-base-Python/pycharm/python_function/venv/Scripts/python
# -*- coding: utf-8 -*-

# global > nonlocal > local
x = 100 # 전역변수
def a():
    x = 40 # 지역변수
    return x

if __name__ == "__main__":
    print(a()) # --> 40
    print(x)
