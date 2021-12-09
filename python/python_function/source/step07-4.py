# /e/Fear/Univ/Big_data/Training/Github/Codding-base-Python/pycharm/python_function/venv/Scripts/python
# -*- coding: utf-8 -*-

# 조건 1. global x, nonlocal x, x 자유롭게 사용
# 조건 2. 반두시 global x 또는 nonlocal x 사용
# 조건 3. 변수는 x만 사용됨
# 100, 70, 30, 70 순서대로 출력

x = 100
def a():
    x = 70
    return x

def b():
    x = 30
    return x

def c():
    global x
    x = a()
    return x

if __name__ == "__main__":
    print(x)
    for function in [a, b]:
        print(function())
    c()
    print(x)