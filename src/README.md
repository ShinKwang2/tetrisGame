# 테트리스 게임

### 게임 룰
### 기본
```10개의 새로운 블록이 나올 때 마다, 0.01초씩 빨라진다.```
  

### 상대공격
**3개 이상의 라인을 한 번에 지우면,**
   ```
    1. 상대방에게 배드 블럭을 생성한다.
       - 배드블럭이란? 절대 지울 수 없는 블럭
    2. 상대방의 Level을 올린다.
       - Level이 올라갈 수록 0.1초씩 빨라진다.
   ```
### 랭킹 등록
  * 이긴 사람의 이름을 먼저 등록, 이후 진 사람 등록
    * 만약 이미 등록된 이름이라면 승과 패를 추가한다.
    * 오락실 게임처럼 완전히 게임을 종료하면 랭킹이 초기화된다.
  * 랭킹 5위까지 보여준다.