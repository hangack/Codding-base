# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

# nested function 활용 예
def a(x, y):
    """

    :param x: numeric
    :param y: numeric
    :return:
    """
    if x>5 and x<8 and y<8:
        print(x*y)
    else:
        print("다른 값을 입력하세요.")
        raise ValueError("x is {}, y is {}".format(x, y))


if __name__ == "__main__":
    print(a(6, 6))