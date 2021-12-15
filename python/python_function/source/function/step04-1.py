# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

# mutable (변경 가능한): list, dict, set, bytearray, objects, functions
# immutable (변경 불가능한): tuple, int, float, bool, string, bytes

def list_a(var=[]):
    var.append(1)
    return var

def list_b(var=None):
    if var is None:
        var = []
    var.append(1)
    return var


if __name__ == "__main__":
    print(list_a())
    print(list_a())
    print(list_a())
    print("-------------")
    print(list_b())
    print(list_b())
    print(list_b())