package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/29.
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";
    public GamePlayer(String _name) {
        this.name = _name;
    }
    public void login(String user, String password) {
        System.out.println("登录名为"+user+"的用户"+this.name+"登陆成功!");
    }

    public void killBoss() {
        System.out.println(this.name+"在打怪!");
    }

    public void upgrade() {
        System.out.println(this.name+"又升了一级!");
    }
}
