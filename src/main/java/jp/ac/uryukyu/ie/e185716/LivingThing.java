package jp.ac.uryukyu.ie.e185716;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     *
     * hpと攻撃力を表示するためのメソッド
     * @param name 名前
     * @param hitpoint　体力
     * @param attack　攻撃力
     */
    public LivingThing(String name, int hitpoint, int attack){
        this.name = name;
        this.hitPoint = hitpoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitpoint, attack);
    }

    public boolean isDead(){
        return dead;
    }


    public void setDead(boolean dead){
        this.dead = dead;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHitpoint(){
        return hitPoint;
    }

    public void setHitpoint(int hitpoint) {
        this.hitPoint = hitpoint;
    }

    public int getAttack(){
        return attack;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public void attack(LivingThing livingThing){
        int damage = (int) (Math.random() * attack);
        if(dead == false ) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, livingThing.getName(), damage);
            livingThing.wounded(damage);
        }
    }



    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}