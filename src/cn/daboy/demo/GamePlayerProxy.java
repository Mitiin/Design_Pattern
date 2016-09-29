package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/29.
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;
    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
