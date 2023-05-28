package observer.obs;

import observer.Observer;

public class ThirdPart implements Observer {
    private String name;

    public ThirdPart(String name){
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
        return "������"+name+"�յ�����������Ϣ";
    }
}
