# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- conding: utf-8 -*-

def try_func(x, idx):
    try:
        return  100/x[idx]
    except ZeroDivisionError:
        print("Zero로 나눌 수 없음")
    except IndexError:
        print("Index 범위 밖에 있음")
    except TypeError:
        print("Type Error가 존재")
    except NameError:
        print("정의되지 않은 변수가 존재")
    finally:
        print("무조건 실행됨")

def main():
    a = [50,60,0,70]
    print(try_func(a,1))

    # zero Division Error
    print(try_func(a, 0))

    # Index Error
    print(try_func(a,5))

    # type Error
    print(try_func(a,"안녕"))

if __name__ == "__main__":

    main()

    print("Program is done")