package presenter;

import model.ModelLogin;
import model.ModelResponetoPresenter;
import view.ViewLogin;

/**
 * Created by anh khoa on 1/8/2018.
 */

public class PresenterLogin  implements ModelResponetoPresenter {
    private ModelLogin modelLoginl;
    private ViewLogin viewLogin;

    public PresenterLogin(ViewLogin viewLogin) {
        this.viewLogin = viewLogin;
    }

    public void receiveHandleLogin(String username, String password){
        //tại phương thức này ,thông báo cho model biet de xu lý logic
        modelLoginl=new ModelLogin(this);
        modelLoginl.handleLogin(username,password);
    }

    @Override
    public void onLoginSuccess() {
        viewLogin.LoginSuccess();
    }

    @Override
    public void onLoginFailed() {
        viewLogin.LoginFailed();
    }
}
