# /e/Fear/Univ/Big_data/Training/Github/Codding-base-Python/pycharm/python_function/venv/Scripts/python
# -*- coding: utf-8 -*-

# 데코레이터
# Rule:
#   1. 함수를 객체로 사용하는 방식
#       - 변수 처리

def my_func():
    print("hi")

if __name__ == "__main__":
    x = my_func
    print(type(x))
    print(x())

    print_function = print
    print(print_function("파이썬"))