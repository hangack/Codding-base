## Anaconda git Pycharm 세팅

### 설치
anaconda: 환경변수 패스 설정 필수

pycharm: 환경변수 패스 설정 및 파이썬 확장자 연동 (체크박스 4개)


### git 세팅

github에서 New Repository 생성

Repository와 동일한 폴더명에 Git bash

####  우선 git과 github 주소를 연동하기 위해 로그인한다.
```
git config --global user.name "유저네임"

git config --global user.email 이메일@example.com
```

#### cf) 깃 로그아웃

자격 증명 제거 방법: https://syki66.github.io/blog/2020/05/08/github-logout.html

#### git bash 명령어 입력

```
echo "# 프로젝트명" >> README.md
```

```
git init
```

```
git add README.md
```

```
git commit -m "코멘트"
```

```
git branch -M main
```

```
git remote add origin https://github.com/유저네임/프로젝트명.git
```

```
git push -u origin main
```
https://dlee0129.tistory.com/22

처음은 위 세팅방법을 따르고 이후론 Repository 생성 시 Public & Add a README file을 생성하면 된다.(git clone 명령어 사용해서 프로젝트를 다운받을 수 있다.)


<hr>

### pycharm 터미널 git bash 연동
"~Git\bin\bash.exe" --login

https://opentutorials.org/course/3718/24657

<hr>

- 기간: 2021년 9월 1일 ~ 10월 26일
- 파일 추가: git add 파일명.확장자
    + . : 모든 파일
    + git add. (X)
    + git add . (O)
```markdown
~ $ git add .
```

- 커밋 메시지 (로그 메시지)
```markdown
~ $ git commit -m "UPDATED: README.md fixed"
```

- 파일 최종 업로드
```markdown
~ $ git push
```

- Git 프로젝트 불러오기
```
~ $ git clone https주소
```


<hr>
 .md 확장자: Markdown 언어를 사용하여 텍스트 문서를 HTML로 변환하는 방법

- https://kor.go-travels.com/28463-md-file-4143558-7980136
- https://ko.wikipedia.org/wiki/%EB%A7%88%ED%81%AC%EB%8B%A4%EC%9A%B4
