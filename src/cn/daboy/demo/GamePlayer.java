package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/29.
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";
    private IGamePlayer proxy = null;

    public GamePlayer(String _name) {
        this.name = _name;
    }

    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登陆名为"+user+"的用户"+this.name+"登陆成功!");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name+"在打怪!");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name+"又升了一级!");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else  {
            return true;
        }
    }
}
