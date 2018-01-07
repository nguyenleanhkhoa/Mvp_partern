package model;

/**
 * Created by anh khoa on 1/8/2018.
 */

public class ModelLogin {
    ModelResponetoPresenter callback;

    public ModelLogin(ModelResponetoPresenter callback) {
        this.callback = callback;
    }

    public void handleLogin(String username, String password){
        // xử lý logic
        if("anhkhoa".equals(username)&&"123".equals(password)){
            callback.onLoginSuccess();
        }else {
            callback.onLoginFailed();
        }
    }
}
