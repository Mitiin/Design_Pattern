package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/29.
 */
public interface IGamePlayer {
    //登录游戏
    public void login(String user,String password);

    //杀怪，这是网络游戏的主要特色
    public void killBoss();

    //升级
    public void upgrade();
}
