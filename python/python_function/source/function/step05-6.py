# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

import contextlib
import time

@contextlib.contextmanager
def timer():
    """시간 측정하는 context manager 관리 함수

    Yields:
        None
    """

    start = time.time()
    yield
    end = time.time()

    print("timer(Elapsed): {:.2f}s".format(end - start))


def main():
    with timer():
        print("소요 시간")
        time.sleep(0.25) # 크롤링 할 때, 종종 사용

if __name__ == "__main__":
    main()