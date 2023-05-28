package adapter;

import adapter.adapters.deleteAdapter;
import adapter.adapters.insertAdapter;
import adapter.adapters.updateAdapter;

public class test {
    public static void main(String[] args) {
        System.out.println(showmsg(0));
        System.out.println("-----");
        System.out.println(showmsg(1));
        System.out.println("-----");
        System.out.println(showmsg(2));
    }

    public static String showmsg(int i) {
        String message;
        messageController msg;
        if (i == 0) {
            msg = new insertAdapter();
            message= msg.showMeaasge();
        } else if (i == 1) {
            msg = new deleteAdapter();
            message= msg.showMeaasge();
        } else {
            msg = new updateAdapter();
            message= msg.showMeaasge();
        }
        return message;
    }
}
