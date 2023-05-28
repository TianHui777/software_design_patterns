package adapter.adapters;

import adapter.messageController;
import adapter.msg.deleteMsg;

public class deleteAdapter extends messageController {

    private deleteMsg msg;

    public deleteAdapter(){
        msg = new deleteMsg();
    }

    @Override
    public String showMeaasge() {
        return msg.show();
    }
}
