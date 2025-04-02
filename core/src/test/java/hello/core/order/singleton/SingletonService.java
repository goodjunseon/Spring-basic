package hello.core.order.singleton;

public class SingletonService {

    //자기 자신을 내부에 private, static 으로 선언
    private static final SingletonService instance = new SingletonService();


    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void login() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
