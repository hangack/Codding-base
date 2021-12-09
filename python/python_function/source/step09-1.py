# /e/Fear/Univ/Big_data/Training/Github/Codding-base-Python/pycharm/python_function/venv/Scripts/python
# -*- coding: utf-8 -*-

# 데코레이터 선행 개념
"""
1. 함수: 객체로서의 함수
2. Nested 함수
3. NonLocal Variables
4. Clousres
"""

def two_args(func):
    return func

@two_args # << 함수
def add(a,b):
    return a+b

if __name__ == "__main__":
    add(1,2)