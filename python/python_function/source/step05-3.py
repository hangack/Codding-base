# /e/Fear/Univ/Big_data/Training/Github/Codding-base-Python/pycharm/python_function/venv/Scripts/python
# -*- coding: utf-8 -*-

# context manager 파일 생성

import contextlib

@contextlib.contextmanager
def my_context():
    print("Hello")
    yield 10
    print("Cya")

def main():
    with my_context() as temp:
        print("temp 인사말 {}".format(temp))


if __name__ == "__main__":
    main()