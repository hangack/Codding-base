# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

# Context Manager
# context 세팅
# 코드 실행
# context 코드 제거

def main():

    # Context manager
    with open("data/function/my_file.txt") as file:
        text = file.read()
        text_length = len(text)

    print("파일 글자 총 길이: {}".format(text_length))


if __name__ == "__main__":
    main()
