# /e/Fear/Univ/Big_data/Training/Github/Codding-base-Python/pycharm/python_function/venv/Scripts/python
# -*- coding: utf-8 -*-

# 함수를 객체로 지정해서 사용
# nested function
# nonlocal
# Closure
# >> 데코레이터를 배우기 위해 선행

# Closure: 상태값을 임시 저장

x = 100
def a(x):
    def b():
        print(x)
    return b

if __name__ == "__main__":
    func = a(x)
    print(func())

    del[x] # 100 삭제
    print(func())
    print(len(func.__closure__))
    print("closure:",func.__closure__[0].cell_contents)