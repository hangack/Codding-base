# /e/Fear/Univ/Big_data/Training/Github/Codding-base-Python/pycharm/python_function/venv/Scripts/python
# -*- coding: utf-8 -*-

# mutable (변경 가능한): list, dict, set, bytearray, objects, functions
# immutable (변경 불가능한): tuple, int, float, bool, string, bytes

import pandas as pd

#def add_new_column(new_vals, data = pd.DataFrame()): # 원하지 않는 column이 계속 추가됨ㅗ
def add_new_column(new_vals, data = None): # `if data is None:` 라인을 추가해서 해결
    """새로운 컬럼을 data에 추가.
    컬럼명: columns_<n> 형태로 저장
    이 때, 모두 numeric 형태로 저장

    Args:
        new_vals (iterable): 함수 실행마다 들어가는 새로운 컬럼 값을 의미
        data (Dataframe, optional): 함수가 실행시 업데이트,
            만약, 데이터프레임으로 입력받지 못하면, 임의의 데이터프레임이 디폴트로 생성됨
    Returns:
        Dataframe
    """
    if data is None:
        data = pd.DataFrame()
    data['col_{}'.format(len(data.columns))] = new_vals
    return data


if __name__ == "__main__":
    print(add_new_column(new_vals=range(10)))
    print(add_new_column(new_vals=range(10)))
    print(add_new_column(new_vals=None))
    print(add_new_column(new_vals=range(10)))
    print(add_new_column(new_vals=None))