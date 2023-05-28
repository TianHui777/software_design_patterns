package adapter.adapters;

import adapter.messageController;
import adapter.msg.insertMsg;

public class insertAdapter extends messageController {

    private insertMsg msg;

    public insertAdapter(){
        msg = new insertMsg();
    }

    @Override
    public String showMeaasge() {
        return msg.show();
    }
}
