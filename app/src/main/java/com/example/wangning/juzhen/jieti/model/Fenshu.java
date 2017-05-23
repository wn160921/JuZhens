package com.example.wangning.juzhen.jieti.model;

/**
 * Created by wangning on 2017/5/23.
 */

public class Fenshu {
    private int fenzi;
    private int fenm;
    public int getFenzi(){
        return fenzi;
    }
    public int getFenm(){
        return fenm;
    }
    public void setFenzi(int fenzi){
        this.fenzi=fenzi;
    }
    public void setFenm(int fenm){
        this.fenm=fenm;
    }

    public Fenshu(String s){
        String[] er;
        if(s.contains(".")){
            er=s.split("\\.");
            int wi=huoquweishu(Integer.valueOf(er[1]));
            fenm=fengmuo(wi);
            fenzi=Integer.valueOf(er[1])+fenm*Integer.valueOf(er[0]);
        }else if(s.contains("/")) {
            er=s.split("/");
            fenzi=Integer.valueOf(er[0]);
            fenm=Integer.valueOf(er[1]);
        }else {
            er=s.split("//./");
            fenzi=Integer.valueOf(er[0]);
            fenm=1;
        }
    }
    public void huanjian(){
        int yue=zuidagy(fenzi,fenm);
        fenzi=fenzi/yue;
        fenm=fenm/yue;
    }
    //格式化
    public String geshihua(){
        huanjian();
        return String.valueOf(fenzi)+"/"+String.valueOf(fenm);
    }
    //计算最大公约数
    public int zuidagy(int a,int b){
        while (true){
            if(a>b){
                a=a-b;
            }else if(b>a){
                b=b-a;
            }else if(a==b){
                return a;
            }
        }
    }
//    获取位数
    public int huoquweishu(int a){
        if(a<10){
            return 1;
        }else if(a<100){
            return 2;
        }else if(a<1000){
            return 3;
        }else if(a<10000){
            return 4;
        }else if(a<100000){
            return 5;
        }else {
            return 6;
        }
    }
//    获取分母位数
    public int fengmuo(int a){
        switch (a){
            case 1:
                return 10;
            case 2:
                return 100;
            case 3:
                return 1000;
            case 4:
                return 10000;
            case 5:
                return 100000;
            default:
                return 1000000;
        }
    }

}
