# /e/Fear/Univ/Big_data/Training/Github/Codding-base-Python/pycharm/python_function/venv/Scripts/python
# -*- coding: utf-8 -*-

import contextlib
import sqlite3

@contextlib.contextmanager
def db_connect(url):

    # example.db 주소 입력
    db = sqlite3.connect(url)
    yield db

    # db 연동 종료
    db.close()


def main(url):
    with db_connect(url) as con:
        cur = con.cursor()
        for row in cur.execute('SELECT * FROM stocks ORDER BY price'):
            print(row)


if __name__ == "__main__":
    url = "example.db"
    main(url)