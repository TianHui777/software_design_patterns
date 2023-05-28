package adapter.adapters;

import adapter.messageController;
import adapter.msg.updateMsg;

public class updateAdapter extends messageController {

    private updateMsg msg;

    public updateAdapter(){
        msg = new updateMsg();
    }

    @Override
    public String showMeaasge() {
        return msg.show();
    }
}
