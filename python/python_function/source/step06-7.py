# /e/Fear/Univ/Big_data/Training/Github/Codding-base-Python/pycharm/python_function/venv/Scripts/python
# -*- coding: utf-8 -*-

def math_functions(func_name):
    # 사칙연산 코드 작성 if_else_elif
    # nested function 활용. 각 함수 return값 추가
    if func_name == "add":
        def add(a,b):
            return a+b
        return add
    elif func_name == "minus":
        def minus(a,b):
            return a-b
        return minus
    elif func_name == "times":
        def times(a,b):
            return a*b
        return times
    elif func_name == "div":
        def div(a,b):
            return a/b
        return div

    else:
        print("Error: {} is not arithmetic operation".format(func_name))


if __name__ == "__main__":
    x = 100
    y = 2

    add = math_functions("add")
    print(add(x,y))
    minus = math_functions("minus")
    print(minus(x,y))
    times = math_functions("times")
    print(times(x,y))
    div = math_functions("div")
    print(div(x,y))
    sqrt = math_functions("sqrt")
    print(sqrt(x,y))