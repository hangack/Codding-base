# /e/Fear/Univ/Big_data/Training/Github/Codding-base-Python/pycharm/python_function/venv/Scripts/python
# -*- coding: utf-8 -*-

# 다양한 함수를 리스트 안에 넣기
# 딕셔너리에 추가한다.

def my_func():
    print("hi")


if __name__ == "__main__":
    list_functions = [my_func, open, print]
    list_functions[2]("전 리스트에 있어요")

    dict_functions = {
        "fun_1": my_func(),
        "fun_2": open,
        "fun_3": print
    }

    print(dict_functions["fun_3"]("전 딕셔너리에 있어요"))