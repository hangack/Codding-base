# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

# 함수를 객체로 지정해서 사용
# nested function
# nonlocal
# Closure
# >> 데코레이터를 배우기 위해 선행

# Closure: 상태값을 임시 저장

def a():
    a = 123
    def b():
        print(a)
    return b

if __name__ == "__main__":
    func = a()
    func()
    print(func.__closure__)
    print(type(func.__closure__))
    print(len(func.__closure__))
    print(func.__closure__[0].cell_contents)