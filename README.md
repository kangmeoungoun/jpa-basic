##### 프록시와 연관관계 관리
##### 프록시

```java
org.hibernate.LazyInitializationException: could not initialize proxy [jpabook.jpashop.Member#1] - no Session
//jpa 만들다 보면 꼭 만날 에러
//프록시 객체 가져와서 준영속 상태로 만든후 그객체로 사용할떄
em.detach(refMember);
refMember.getUsername();
```

![image](https://user-images.githubusercontent.com/40969203/105647563-e8240e00-5ee9-11eb-85ea-5f765dbec64c.png)
![image](https://user-images.githubusercontent.com/40969203/105647565-ea866800-5ee9-11eb-9521-0d6dbe926959.png)
![image](https://user-images.githubusercontent.com/40969203/105647569-ed815880-5ee9-11eb-89e4-c9dd857d11bf.png)
![image](https://user-images.githubusercontent.com/40969203/105647570-f07c4900-5ee9-11eb-9c1e-9df63689d50d.png)
![image](https://user-images.githubusercontent.com/40969203/105647574-f2dea300-5ee9-11eb-9ad8-13ee1a92cf58.png)
![image](https://user-images.githubusercontent.com/40969203/105647577-f5d99380-5ee9-11eb-9c7d-a212da0eaccb.png)
![image](https://user-images.githubusercontent.com/40969203/105647580-f96d1a80-5ee9-11eb-89f4-cb14e3f459be.png)
![image](https://user-images.githubusercontent.com/40969203/105647581-fd00a180-5ee9-11eb-9930-2723c88385d6.png)
