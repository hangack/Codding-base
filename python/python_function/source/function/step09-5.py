# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

# 시간 측정 데코레이터(Decorator) 함수
import time

def timer(func):
    """함수 실행 시 얼마나 오래 걸리는지 확인"""

    def wrapper(*args, **kwargs):

        # 현재 시간
        time_start = time.time()

        # decorated 함수 불러오기
        result = func(*args, **kwargs)
        time_total = time.time() - time_start

        print("총 {}함수 실행 시간: {}".format(func.__name__, time_total))

        return result

    return wrapper

@timer
def check_time(num):
    time.sleep(num)


if __name__ == "__main__":
    check_time(3)