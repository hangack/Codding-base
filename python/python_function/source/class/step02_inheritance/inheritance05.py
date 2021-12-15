# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

"""
모방 (부모 클래스를 모방)
모한 후, 자식이 참조
"""

import pandas as pd

class newDataFrame(pd.DataFrame):
    pass

if __name__ == "__main__":
    temp_dict = {"A": [1,2,3],
                "B": [4,5,6]}
    temp = pd.DataFrame(temp_dict, columns=["B","A"])
    #print(temp)
    print("-----")
    temp2 = newDataFrame(temp_dict, columns=["B","A"])