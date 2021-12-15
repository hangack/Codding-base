# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

def cnt_letter(content, latter):
    """content 안에 있는 문자를 세는 함수
    # Google Stlye
    Args:
        content(str): 탐색 문자열
        letter(str): 찾을 문자열

        Returns:
            int
    """
    # code 작업
    print("함수 테스트")
    return(len([char for char in content if char == latter])) # 리스트 컴프리헨션

def add(a,b):
    return a+b

if __name__ == "__main__":
    a = 1
    b = 3
    print(add(a,b))
    docstring = cnt_letter.__doc__
    border = "*" * 20
    print('{}\n{}\n{}'.format(border, docstring, border))
    print(cnt_letter)