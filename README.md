##### 프록시와 연관관계 관리
##### 영속성 전이(CASCADE) 와 고아 객체

```java
    @OneToMany(mappedBy = "parent",cascade = CascadeType.ALL)
    private List<Child> childList = new ArrayList<>();

    //이안에 있는 에들도 persist 할때 같이 한다는 개념.
    //소유자가 한명일때 사용가능
    //child 를 다른 에도 가지고 있으면 사용 x
    parent.addChild(child1);
    parent.addChild(child2);
    em.persist(parent);


@OneToMany(mappedBy = "parent",cascade = CascadeType.ALL,orphanRemoval = true)
//고아객체 orphanRemoval = true 이놈도 소유자가 한명일떄 사용가능
```

![image](https://user-images.githubusercontent.com/40969203/105715641-33c5ce80-5f61-11eb-9a89-85a75447c2bc.png)
![image](https://user-images.githubusercontent.com/40969203/105715649-36282880-5f61-11eb-9045-d2ac3f7e64ce.png)
![image](https://user-images.githubusercontent.com/40969203/105715661-388a8280-5f61-11eb-90df-9a5e7ceafbad.png)
![image](https://user-images.githubusercontent.com/40969203/105715669-3b857300-5f61-11eb-9d43-1c612782dd36.png)
![image](https://user-images.githubusercontent.com/40969203/105715680-3f18fa00-5f61-11eb-954c-e5ad12ccbbd0.png)
![image](https://user-images.githubusercontent.com/40969203/105715686-417b5400-5f61-11eb-812d-c5df47480398.png)
![image](https://user-images.githubusercontent.com/40969203/105715702-45a77180-5f61-11eb-9f38-9a214bc0daba.png)
