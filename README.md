##### 연관관계 매핑 기초
###### 양방향 연관관계와 연관관계의 주인2 - 주의점,정리

##### lombok 에서 toString 사용 하지 말기 양방향 참조일떄
순환참조 개념 같이 Member ->Team->Member->Team 무한루프
##### JSON 라이브러리 컨트롤러에서 바디에 entity 반환할때 json 변환시 다시또 무한루프
##### 컨트롤러 반환할때는 entity 사용하지말것.

![image](https://user-images.githubusercontent.com/40969203/105580792-d8b1a180-5dd1-11eb-9212-1dabc67bbf7d.png)
![image](https://user-images.githubusercontent.com/40969203/105580793-dc452880-5dd1-11eb-9269-4c1133350ded.png)
![image](https://user-images.githubusercontent.com/40969203/105580795-df401900-5dd1-11eb-9f2b-ab246b555163.png)
![image](https://user-images.githubusercontent.com/40969203/105580800-e23b0980-5dd1-11eb-90b1-e449302cfbeb.png)
![image](https://user-images.githubusercontent.com/40969203/105580803-e49d6380-5dd1-11eb-8d4d-0bbcaa63640d.png)