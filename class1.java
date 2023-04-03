class animal{
    String name;
    float height;
    int weight;
    int rate;
    animal(String name,float height,int weight,int rate){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.rate = rate;
    }
    void show(){
        System.out.println("姓名："+this.name);
        System.out.println("身高："+this.height);
        System.out.println("體重："+this.weight);
        System.out.println("速度："+this.rate);
    }
    double distance(int x,double y){
        return x*y*this.rate;
    }
    int distance(int x){
        return x*this.rate;
    }
    public static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class human extends animal{
    String sex;
    human(String name,float height,int weight,int rate,String sex){
        super(name,height,weight,rate);
        this.sex = sex;
    }
    void show(){
        super.show();
        System.out.println("性別："+this.sex);
    }
}

class snow extends human{
    String snowskill;
    snow(String name,float height,int weight,int rate,String sex, String snowskill){
        super(name,height,weight,rate,sex);
        this.snowskill = snowskill;
    }
    void show(){
        super.show();
        System.out.println("冰凍技能："+this.snowskill);
    }
    double distance(int x, double y){
        return x*y*this.rate*2;
    }
    int distance(int x){
        return x*this.rate*2;
    }
}
