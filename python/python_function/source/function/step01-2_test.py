# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

import step_01_2_basic
import inspect

docstring = inspect.getsource(step_01_2_basic.cnt_letter)

if __name__ == "__main__":
    border = "*" * 20
    print('{}\n{}\n{}'.format(border, docstring, border))