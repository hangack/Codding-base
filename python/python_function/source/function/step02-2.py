# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

# 수치형 데이터 활용해서, 정규화
# 표준화 (공식)
# Y(Z-score) = (측정값 - 평균) / 표준편차
#
#
# 공식 찾고, 함수 작성
# iris data에서 적용

import seaborn as sns

def z_score_standard(column):
    """데이터 표쥰화를 만드는 과정
    Args:
        column (pandas Series): 표준화를 하기 위한 것

    Return: Series
        pandas serise: z_score 표준화 공식을 적용
    """

    z_score = (column - column.mean()) / column.std()
    return z_score

if __name__ == "__main__":
    iris = sns.load_dataset("iris")
    print(iris.head())

    iris['sepal_length'] = z_score_standard(iris['sepal_length'])
    iris['sepal_width'] = z_score_standard(iris['sepal_width'])
    iris['petal_length'] = z_score_standard(iris['petal_length'])
    iris['petal_width'] = z_score_standard(iris['petal_width'])

    print(iris.head())