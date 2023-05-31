package observer.obs;

import observer.Observer;

public class User implements Observer {
    private String name;
    private String pwd;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getMsg() {
        return "�û�"+name+"�յ�����������Ϣ";
    }
}
